package com.hms.management.pathology.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.management.pathology.modal.PathologyCategory;

public interface PathologyCategoryRepo extends JpaRepository<PathologyCategory, Integer>{

}
