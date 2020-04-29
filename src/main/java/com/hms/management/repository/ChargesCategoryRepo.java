package com.hms.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.management.model.ChargesCategory;

public interface ChargesCategoryRepo extends JpaRepository<ChargesCategory, Integer> {

	List<ChargesCategory> findByChargeType(String Chargestype);

}
