package com.vedika.functionhall.controller;

import java.util.HashMap;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedika.functionhall.model.User;
import com.vedika.functionhall.service.UserService;

@RestController
@RequestMapping("/api")
public class RegisterController {

	@Autowired
	private UserService userservice;

	@PostMapping(path = "/registerUser")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user, BindingResult bindingResult)
			throws Exception {

		User userExists = userservice.findUserByMobilenumber(user.getMobileNumber());

		if (userExists != null) {

			bindingResult.rejectValue("email", "error.user",
					"There is already a user registered with the username provided");
		}
		HashMap<String, Object> resp = new HashMap<>();
		try {
			userservice.register(user);
		} catch (ConstraintViolationException e) {
			HashMap<String, String> messages = new HashMap<>();
			e.getConstraintViolations().stream().forEach(constraintViolation -> {
				messages.put(constraintViolation.getPropertyPath().toString(), constraintViolation.getMessage());
			});
			resp.put("error", true);
			resp.put("messages", messages);
		}
		resp.put("user", user);
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

}
