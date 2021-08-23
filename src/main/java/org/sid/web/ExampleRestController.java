package org.sid.web;

import org.sid.entities.Exemple;
import org.sid.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api")
public class ExampleRestController {
	
	@Autowired
	private ExampleService exampleService;
	
	
	public ExampleRestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExampleRestController(ExampleService exampleService) {
		super();
		this.exampleService = exampleService;
	}

	@GetMapping("/example")
	public ResponseEntity<Exemple> getExample(@RequestParam(required = true) int id) {
		return new ResponseEntity<>(exampleService.getExampleById(id), HttpStatus.OK);
	}
}
