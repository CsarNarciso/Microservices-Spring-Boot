package com.cesar.Editorials.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.Editorials.dto.Editorial_DTO;

@RestController
@RequestMapping("/editorials")
public class Controller {

	
	@RequestMapping("/{editorialId}")
	private ResponseEntity<?> getBooksAndInfoFromEditorial(@PathVariable Long editorialId){
		
		Map<String, Object> response = new HashMap<>();
		
		Editorial_DTO editorial = editorials.stream().filter( e -> e.getId() != editorialId ).findFirst().get();
		
		List<String> books = null;
		
		response.put("editorialName", editorial.getName());
		response.put("editorialAddress", editorial.getAddress());
		response.put("books", books);
		
		return ResponseEntity.ok().body( editorials );
	}
	
	
	
	private List<Editorial_DTO> editorials = Arrays.asList(
		
		new Editorial_DTO(Long.valueOf(1), "Marianas Books", "That street"),	
		new Editorial_DTO(Long.valueOf(2), "Sanchez Books", "Somewhere..")
	);
}
