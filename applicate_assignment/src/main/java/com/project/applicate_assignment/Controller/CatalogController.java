package com.project.applicate_assignment.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.applicate_assignment.Model.Catalog;
import com.project.applicate_assignment.service.catalog_service;

@RestController
@RequestMapping("/retail")
public class CatalogController {
	@Autowired
	catalog_service catalogService;

	//GET API for sku_name
	@RequestMapping(path = "/getskuname/{name}/{supplierid}", method = RequestMethod.GET)
    public ResponseEntity<List<String>> listofskuname(@PathVariable("name") String keyword,@PathVariable("supplierid") int supplierid) {
      
		List<String>result =  catalogService.findUsersByKeyword(keyword,supplierid);
		if(result.size()==0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(result, HttpStatus.OK);
		}
    }
    
	//POST API of catalog data
    @PostMapping("/addcatalog")
    public ResponseEntity<Object> addCatalog(@RequestBody Catalog catalog) {
    	try {
    		catalogService.addCatalog(catalog);
    		return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
    	
    }
    }
