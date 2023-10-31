package com.cesar.BookApi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.BookApi.dto.Book_DTO;

@RestController
@RequestMapping("/books")
public class Controller {

	
	@GetMapping()
	private ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok( books ); 		
	}

	
	
	@PostMapping()
	private ResponseEntity<?> create(@RequestBody Book_DTO book) {
		
		book.setId( Long.valueOf( books.size() + 1 ));
		
		books.add( book );
		
		return ResponseEntity.status(HttpStatus.CREATED).body( book );
	}	
	
	
	//---------------INSTNANCES-------------------

	List<Book_DTO> books = new ArrayList<>();
}
