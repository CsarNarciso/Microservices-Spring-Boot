package com.cesar.Editorials.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-books", path = "/books")
public interface FeignBooks {

	@GetMapping("/{editorialId}")
	public List<String> getBooksByEditorialId(@PathVariable Long editorialId);
}
