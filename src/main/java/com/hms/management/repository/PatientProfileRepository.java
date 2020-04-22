package com.hms.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.model.PatientProfile;

public interface PatientProfileRepository extends JpaRepository<PatientProfile, Integer>{

 
	 PatientProfile findByPatientId(String patientId);
	 @Query("select p from PatientProfile p where p.patientId=?1")
	 List<PatientProfile> fetchByPatientId(String patientId);
}
