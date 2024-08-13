
package com.cesar.Editorials.feign;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cesar.Editorials.feign.FeignBooks.Fallback;

@FeignClient(name = "msvc-books", path = "/books", fallback = Fallback.class)
public interface FeignBooks {

	@GetMapping("/{editorialId}")
	public List<String> getBooksByEditorialId(@PathVariable Long editorialId);
	
	
	@Component
	static class Fallback implements FeignBooks{

		@Override
		public List<String> getBooksByEditorialId(Long editorialId) {
			
			return Arrays.asList("No books...");
		}
	}
}
