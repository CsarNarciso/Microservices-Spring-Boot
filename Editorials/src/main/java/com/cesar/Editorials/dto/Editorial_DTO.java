package com.cesar.Editorials.dto;

public class Editorial_DTO {

	private Long id;
	
	private String name;

	private String address;
	
	public Editorial_DTO(Long id, String name, String address) {
		
		this.setId(id);
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
