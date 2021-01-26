package com.project.applicate_assignment.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import com.project.applicate_assignment.Model.Catalog;
import com.project.applicate_assignment.repository.catalog_Repository;

@Service
@Transactional
public class catalog_service {

	@Autowired
	private catalog_Repository catalog_Repository;
	
	@SuppressWarnings("null")
	public List<String> findUsersByKeyword(@RequestParam String keyword,@RequestParam int supplierid){
		List<Catalog> resultset = catalog_Repository.findUsersByKeyword(keyword,supplierid);
		List<String> results = new ArrayList<String>();
	        for(Catalog c: resultset) {
	        	results.add(c.getSku_name());
	        }
		return results;
	}
	
	public Catalog addCatalog(Catalog catalog) { 
		return catalog_Repository.save(catalog);
	}
}
