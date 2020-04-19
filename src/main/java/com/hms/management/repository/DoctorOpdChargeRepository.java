package com.hms.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.management.model.DoctorOpdCharge;


public interface DoctorOpdChargeRepository extends JpaRepository<DoctorOpdCharge, Integer> {
	  List<DoctorOpdCharge> findByDoctorId(String paramString);
	}