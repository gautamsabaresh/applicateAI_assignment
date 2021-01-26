package com.project.applicate_assignment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="catalog")
@Table(name= "catalog")
public class Catalog {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sku_code;
	
	@Column(name="sku_name")
	private String sku_name;
	
	@Column(name="sku_description")
	private String sku_description;
	
	@Column(name="brand_name")
	private String brand_name;
	
	@Column(name="brand_description")
	private String brand_description;
	
	@Column(name="supplier_id")
    private int supplier_id;
	public Catalog() {
		super();
	}

	public Catalog(int sku_code, String sku_name, String sku_description, String brand_name, String brand_description,
			int supplier_id) {
		super();
		this.sku_code = sku_code;
		this.sku_name = sku_name;
		this.sku_description = sku_description;
		this.brand_name = brand_name;
		this.brand_description = brand_description;
		this.supplier_id = supplier_id;
		
	}

	public int getSku_code() {
		return sku_code;
	}

	public void setSku_code(int sku_code) {
		this.sku_code = sku_code;
	}

	public String getSku_name() {
		return sku_name;
	}

	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}

	public String getSku_description() {
		return sku_description;
	}

	public void setSku_description(String sku_description) {
		this.sku_description = sku_description;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getBrand_description() {
		return brand_description;
	}

	public void setBrand_description(String brand_description) {
		this.brand_description = brand_description;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	
	
	
}
