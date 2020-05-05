package com.hms.management.pathology.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.pathology.modal.Pathology;

public interface PathologyRepo extends JpaRepository<Pathology, Integer> {
	@Query("select new Map(p as p,c.name as category)  from Pathology p inner join PathologyCategory c on p.category=c.id")
	List<?> fetchAll();

}
