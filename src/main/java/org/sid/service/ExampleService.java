package org.sid.service;

import org.sid.dao.ExampleRepository;
import org.sid.entities.Exemple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
	@Autowired
	private ExampleRepository exampleRepository;
	
	public ExampleService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExampleService(ExampleRepository exampleRepository) {
		super();
		this.exampleRepository = exampleRepository;
	}
	
	public Exemple getExampleById(int id) {
		return exampleRepository.getById(id);
	}
}
