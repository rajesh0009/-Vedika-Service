package com.vedika.functionhall.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class ResponseObject {
	@NotNull(message = "Enter RequestId")
	private String requestId;
	@NotNull(message = "Enter MobileNumber")
	private String mobileNumber;
	@NotNull(message = "Enter Message")
	private String message;
	@NotNull(message = "EnterToken")
    private String token;
	@NotNull(message = "Enter expirationtime")
    private Date expirationtime;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpirationtime() {
		return expirationtime;
	}

	public void setExpirationtime(Date expirationtime2) {
		this.expirationtime = expirationtime2;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseObject [requestId=" + requestId + ", mobileNumber=" + mobileNumber + ", message=" + message
				+  "]";
	}

	
}
