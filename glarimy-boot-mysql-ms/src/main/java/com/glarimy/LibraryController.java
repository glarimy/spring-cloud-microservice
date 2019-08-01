package com.glarimy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
	@Autowired
	private LibraryService service;
	
	@RequestMapping(method = RequestMethod.GET, path = "/book/{isbn}")
	public ResponseEntity<Book> find(@PathVariable("isbn") int isbn){
		return new ResponseEntity<Book>(service.find(isbn), HttpStatus.OK);
	}
}