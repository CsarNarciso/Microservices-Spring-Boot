package com.cesar.Genres.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.Genres.dto.Genre_DTO;

@RestController
@RequestMapping("/genres")
public class Controller {

	@RequestMapping()
	private ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok().body( genres );
	}
	
	private List<Genre_DTO> genres = Arrays.asList(
		new Genre_DTO("Horror"),
		new Genre_DTO("Science-fiction")
	);
}
