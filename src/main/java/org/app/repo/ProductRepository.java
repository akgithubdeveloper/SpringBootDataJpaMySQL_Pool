package org.app.repo;

import org.app.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	
	Page<Product> findByProdCost(
			
			Double prodCost,Pageable p
			);

	
}
