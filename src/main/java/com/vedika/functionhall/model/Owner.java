
package com.vedika.functionhall.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "functionhall_reference_data")
public class Owner {
	@Id
	private String ownerId;
	@NotNull(message="Enter the correlationid")
	private String corelationId;
	@NotNull(message="Enter the name")
	private String name;
	@NotNull(message="Enter the firstName")
	private String firstName;
	@NotNull(message="Enter the lastName")
	private String lastName;
	@NotNull(message="Enter the functionhallname")
	private String functionhallname;
	@NotNull(message="Enter the city")
	private String city;
	@NotNull(message="Enter the state")
	private String state;
	@NotNull(message="Enter the zipcode")
	private String zipcode;
	@NotNull(message="Enter the  ownerContactNumber")
	private String ownerContactNumber;

	/* db ref */

	private List<FunctionHall> functionhall;
    
	private List<AccountDetails> accountdetails;

	public List<AccountDetails> getAccountdetails() {
		return accountdetails;
	}

	public void setAccountdetails(List<AccountDetails> accountdetails) {
		this.accountdetails = accountdetails;
	}

	public String getCorelationId() {
		return corelationId;
	}

	public void setCorelationId(String corelationId) {
		this.corelationId = corelationId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFunctionhallname() {
		return functionhallname;
	}

	public void setFunctionhallname(String functionhallname) {
		this.functionhallname = functionhallname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getOwnerContactNumber() {
		return ownerContactNumber;
	}

	public void setOwnerContactNumber(String ownerContactNumber) {
		this.ownerContactNumber = ownerContactNumber;
	}

	public List<FunctionHall> getFunctionhall() {
		return functionhall;
	}

	public void setFunctionhall(List<FunctionHall> functionhall) {
		this.functionhall = functionhall;
	}

	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", corelationId=" + corelationId + ", name=" + name + ", firstName="
				+ firstName + ", lastName=" + lastName + ", functionhallname=" + functionhallname + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", ownerContactNumber=" + ownerContactNumber
				+ ", functionhall=" + functionhall + ", accountdetails=" + accountdetails + "]";
	}

}