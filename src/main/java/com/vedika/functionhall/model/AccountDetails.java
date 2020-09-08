package com.vedika.functionhall.model;

import javax.validation.constraints.NotBlank;

public class AccountDetails {
	@NotBlank(message="enter accountNumber")
	private String accountNumber;
	@NotBlank(message="enter accountName")
	private String accountName;
	private String accountType;
	@NotBlank(message="enter bankName")
	private String bankName;
	@NotBlank(message="enter branchName")
	private String branchName;
	@NotBlank(message="enter ifscCode")
	private String ifscCode;
	@NotBlank(message="enter pannumber")
	private String panNumber;

	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountName="
				+ accountName + ", panNumber=" + panNumber + "]";
	}
	

}
