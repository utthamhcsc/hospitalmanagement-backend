package com.hms.management.BloodBank.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.BloodBank.modal.DonateBlood;

public interface DonateBloodRepo extends JpaRepository<DonateBlood, Integer>{
	
	List<DonateBlood> findByDonareId(int id);
	
	@Query("select new Map(d as d,b as b) from DonateBlood d "
			+ "left join BloodDonar b on b.id=d.donareId "
			+ "where Date(d.donateDate) between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<?> getbydate(String fromDate,String toDate);
	@Query("select new Map(d as d,b as b) from DonateBlood d "
			+ "left join BloodDonar b on b.id=d.donareId "
			+ "")
	List<?> getall();

}
