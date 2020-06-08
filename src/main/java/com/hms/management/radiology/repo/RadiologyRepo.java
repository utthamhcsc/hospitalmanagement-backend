package com.hms.management.radiology.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.radiology.modal.Radiology;

public interface RadiologyRepo extends JpaRepository<Radiology, Integer> {
	@Query("select new Map(p as p,c.name as category)  from Radiology p inner join RadiologyCategory c on p.category=c.id")
	List<?> fetchAll();

	
}
