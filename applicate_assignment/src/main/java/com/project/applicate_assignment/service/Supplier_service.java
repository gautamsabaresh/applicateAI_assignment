package com.project.applicate_assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.project.applicate_assignment.Model.Supplier;
import com.project.applicate_assignment.repository.supplier_Repository;

@Service
@Transactional
public class Supplier_service {
	@Autowired
	private supplier_Repository supplier_Repository;
	
	public Supplier addSupplier(Supplier supplier) { 
		return supplier_Repository.save(supplier);
	}
	public List<Supplier> getAllSuppliers() {
		return supplier_Repository.findAll();
	}
}
