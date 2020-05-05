package com.hms.management.BloodBank.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.management.BloodBank.modal.BloodStatus;

public interface BloodStatusRepo extends JpaRepository<BloodStatus, String>{

}
