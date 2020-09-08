package com.vedika.functionhall.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "payment")

public class Payment {
	
	@NotNull(message="Enter the  functionhallId")
    private String functionhallId;
	
	@NotNull(message="Enter Id")
	private String id;
	@NotNull(message="Enter Email")
    private String email;
	@NotNull(message="Enter name")
    private String name;
	@NotNull(message="Enter Phone")
    private String phone;
	@NotNull(message="Enter productInfo")
    private String productInfo;
	@NotNull(message="Enter Amount")
    private Double amount;
	
	@NotNull(message="Enter paymentStatus")
    private PaymentStatus paymentStatus;
	@NotNull(message="Enter paymentDate")
    private Date paymentDate;
	@NotNull(message="Enter txnId")
    private String txnId;
	@NotNull(message="Enter  mihpayId")
    private String mihpayId;
	@NotNull(message="Enter  mode")
    private PaymentMode mode;


    public String getFunctionhallId() {
		return functionhallId;
	}

	public void setFunctionhallId(String functionhallId) {
		this.functionhallId = functionhallId;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getMihpayId() {
		return mihpayId;
	}

	public void setMihpayId(String mihpayId) {
		this.mihpayId = mihpayId;
	}

	public PaymentMode getMode() {
		return mode;
	}

	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}
	@Override
	public String toString() {
		return "Payment [functionhallId=" + functionhallId + ", id=" + id + ", email=" + email + ", name=" + name
				+ ", phone=" + phone + ", productInfo=" + productInfo + ", amount=" + amount + ", paymentStatus="
				+ paymentStatus + ", paymentDate=" + paymentDate + ", txnId=" + txnId + ", mihpayId=" + mihpayId
				+ ", mode=" + mode + "]";
	}
}
