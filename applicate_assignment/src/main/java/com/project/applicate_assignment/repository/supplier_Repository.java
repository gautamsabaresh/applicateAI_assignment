package com.project.applicate_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.applicate_assignment.Model.Supplier;

@Repository
public interface supplier_Repository extends JpaRepository<Supplier, Integer>{
	
}
