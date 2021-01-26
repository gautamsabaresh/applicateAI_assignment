package com.project.applicate_assignment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.project.applicate_assignment.Model.Catalog;


@Repository
public interface catalog_Repository extends JpaRepository<Catalog, Integer> {
	@Query("SELECT s FROM catalog s WHERE s.sku_name LIKE %:keyword% AND s.supplier_id=:supplierid")
	public List<Catalog> findUsersByKeyword(String keyword, Integer supplierid);
}
