package com.project.applicate_assignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.applicate_assignment.Model.Supplier;
import com.project.applicate_assignment.service.Supplier_service;

@RestController
@RequestMapping("/retail")
public class Suppliercontroller {

	@Autowired
	Supplier_service supplierService;
   
	//API to add supplier details
    @PostMapping("/addsupplier")
    public ResponseEntity<Object> add(@RequestBody Supplier supplier) {
        
        try {
        	supplierService.addSupplier(supplier);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
	
	
	
	
}
