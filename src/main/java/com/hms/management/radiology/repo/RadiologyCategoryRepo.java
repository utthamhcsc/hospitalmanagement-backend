package com.hms.management.radiology.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.management.radiology.modal.RadiologyCategory;

public interface RadiologyCategoryRepo extends JpaRepository<RadiologyCategory, Integer> {

}
