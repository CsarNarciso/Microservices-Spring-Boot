package com.cesar.BookApi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping("/{editorialId}")
	private ResponseEntity<?> getNamesByEditorialId(@PathVariable Long editorialId){
		
		List<String> foundBooks = books.stream().filter( b -> b.getEditorialId() == editorialId).map( b -> b.getName() ).toList();
		
		return ResponseEntity.ok( foundBooks );
	}
	
	
	//---------------INSTNANCES-------------------

	List<Book_DTO> books = Arrays.asList(
	
			new Book_DTO((long)1, "The Magic World", (long) 1),
			new Book_DTO((long)2, "The Cupcake Disaster", (long) 2)
	);
}
