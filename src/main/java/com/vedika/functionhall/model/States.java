package com.vedika.functionhall.model;

import java.util.List;

import javax.validation.constraints.NotNull;

public class States {
	@NotNull(message="Enter Name")
	private String name;
	@NotNull(message="Enter Code")
	private String code;
	private List<String> cities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "States [name=" + name + ", code=" + code + ", cities=" + cities + "]";
	}

}
