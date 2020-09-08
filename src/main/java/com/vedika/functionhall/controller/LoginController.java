package com.vedika.functionhall.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vedika.functionhall.model.JwtResponse;
import com.vedika.functionhall.model.ResponseObject;
import com.vedika.functionhall.model.User;
import com.vedika.functionhall.service.SecurityServcie;
import com.vedika.functionhall.service.UserService;
import com.vedika.functionhall.tokenservice.JwtTokenUtil;

@RestController
@RequestMapping("/api")
public class LoginController {
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private SecurityServcie securityservice;

	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/login/verification", method = RequestMethod.POST)
	public ResponseEntity<ResponseObject> sendOTP(@RequestParam String mobileNumber,
			@RequestBody ResponseObject response, BindingResult bindingResult) {
		User user = new User();
		User user1 = userservice.findUserByMobilenumber(mobileNumber);
		// if(mobileNumber.equals(user.getMobileNumber()))
		// if(response.getMobileNumber()==user.getMobileNumber()) {
		ResponseObject res = new ResponseObject();
		res.setRequestId(res.getRequestId());
		res.setMobileNumber(res.getMobileNumber());
		res.setMessage(res.getMessage());
		String twoFaCode = String.valueOf(new Random().nextInt(9999) + 1000);
		securityservice.send2FaCode(mobileNumber, twoFaCode);

		bindingResult.rejectValue("mobileNumber", "error.user",
				"There is already a user registered with the username provided");

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@RequestMapping(value = "login/verification", method = RequestMethod.PUT)
	public ResponseEntity<JwtResponse> verify(@RequestParam String mobileNumber) {

		String msg = "OTP IS NOT VALID PLEASE TRY AGAIN";
		boolean isValid = true;

		if (isValid) {

			String msg1 = "Otp success";
			final String token = jwtTokenUtil.generateToken(mobileNumber);
			final Date expirationtime = jwtTokenUtil.getExpirationDateFromToken(token);
			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String strDate = dateFormat.format(expirationtime);
			System.out.println(expirationtime);
			JwtResponse res = new JwtResponse(token, strDate);
			System.out.println(res);
			res.getExpirationtime();
			return ResponseEntity.ok(new JwtResponse(token, strDate));
		}
		return ResponseEntity.ok(new JwtResponse(msg, msg));

	}

}
