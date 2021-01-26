package com.project.applicate_assignment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="supplier")
public class Supplier {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supplier_id;
	private String supplier_name;
	
	public Supplier() {
		super();
	}
	public Supplier(int supplier_id, String supplier_name) {
		super();
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
	}
	
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	
}
