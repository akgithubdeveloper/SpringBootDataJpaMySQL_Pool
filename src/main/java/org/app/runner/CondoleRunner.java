package org.app.runner;




import javax.activation.DataSource;

import org.app.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CondoleRunner implements CommandLineRunner {

	
	@Autowired
	private ProductRepository repo;
	@Autowired
	private DataSource ds;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(ds.getClass().getName());
		repo.findAll().forEach(System.out::println);
		
		

	}

}
