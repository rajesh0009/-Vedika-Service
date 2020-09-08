package com.vedika.functionhall.model;

import javax.validation.constraints.NotNull;

public class Responsebank {
	@NotNull(message="Enter Id")
	private String id;
	@NotNull(message="Enter BankName")
	private String bankname;
	@NotNull(message="Enter IFSC")
	private String ifsc;
	@NotNull(message="Enter BranchName")
	private String branch;
	@NotNull(message="Enter Address")
	private String address;
	@NotNull(message="Enter ContactNumber")
	private String contact;
	@NotNull(message="Enter State Name")
	private String state;
	@NotNull(message="Enter City Name")
	private String city;
	@NotNull(message="Enter District Name")
	private String district;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Responsebank [id=" + id + ", bankname=" + bankname + ", ifsc=" + ifsc + ", branch=" + branch
				+ ", address=" + address + ", contact=" + contact + ", state=" + state + ", city=" + city
				+ ", district=" + district + "]";
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
