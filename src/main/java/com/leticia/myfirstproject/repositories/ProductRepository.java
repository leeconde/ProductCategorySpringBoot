package com.leticia.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.leticia.myfirstproject.entities.Product;

@Component
public class ProductRepository {

	private Map<Long, Product> map = new HashMap<>();

	public void save(Product category) {
		map.put(category.getId(), category);
	}

	public Product findById(Long id) {
		return map.get(id);
	}

	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}

}
