package com.vedika.functionhall.model;

import javax.validation.constraints.NotNull;

public class PaymentCallback {
	@NotNull(message="Enter  txnId")
    private String txnid;
	@NotNull(message="Enter  mihpayId")
    private String mihpayid;
	@NotNull(message="Enter  mode")
    private PaymentMode mode;
	@NotNull(message="Enter status")
    private String status;
	@NotNull(message="Enter hash")
    private String hash;
	public String getTxnid() {
		return txnid;
	}
	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}
	public String getMihpayid() {
		return mihpayid;
	}
	public void setMihpayid(String mihpayid) {
		this.mihpayid = mihpayid;
	}
	public PaymentMode getMode() {
		return mode;
	}
	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
}