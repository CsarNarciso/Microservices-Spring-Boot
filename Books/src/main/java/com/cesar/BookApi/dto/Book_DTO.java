package com.cesar.BookApi.dto;

public class Book_DTO {

	private Long id;

	private String name;

	private Long editorialId;

	public Book_DTO() {
		super();
	}
	
	public Book_DTO(Long id, String name, Long editorialId) {
		super();
		this.id = id;
		this.name = name;
		this.editorialId = editorialId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEditorialId() {
		return editorialId;
	}

	public void setEditorialId(Long editorialId) {
		this.editorialId = editorialId;
	}

}
