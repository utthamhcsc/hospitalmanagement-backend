package com.hms.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.model.PurchaseMedicineModal;

public interface PurchaseMedicineModalRepo extends JpaRepository<PurchaseMedicineModal, Integer>{
	@Query("select new Map(p as purchase,i as supplier) from PurchaseMedicineModal p inner join ItemSupplier i on "
			+ "p.supplierId=i.id")
	List<?> fetchAll();
	
	@Query("select new Map(p as purchase,i as supplier) from PurchaseMedicineModal p inner join ItemSupplier i on "
			+ "p.supplierId=i.id")
	List<?> fetchAllByExpiry();
	
	
	
	
	@Query("select new Map(m.medicineName as medicineName,m.batchNum as batchNum,v.medicineCompany as companyName,m.medicineCategory as medicineCategory"
			+ ",v.medicineGroup as medicineGroup,i.itemSupplier as supplier,m.expiryDate as expiryDate,m.availableQuantity as quantity) from PurchaseMedicineModal p join p.medicine m "
			+ "inner join Pharmacy v on v.id=m.pharmacyId "
			+ "inner join ItemSupplier i on "
			+ "p.supplierId=i.id"
			+ "")
	List<?> getAll();
	@Query("select new Map(m.medicineName as medicineName,m.batchNum as batchNum,v.medicineCompany as companyName,m.medicineCategory as medicineCategory"
			+ ",v.medicineGroup as medicineGroup,i.itemSupplier as supplier,m.expiryDate as expiryDate,m.availableQuantity as quantity) from PurchaseMedicineModal p join p.medicine m "
			+ "inner join Pharmacy v on v.id=m.pharmacyId "
			+ "inner join ItemSupplier i on "
			+ "p.supplierId=i.id "
			+ "where SUBSTRING(m.expiryDate,1,10) between SUBSTRING(?1,1,10) and SUBSTRING(?2,1,10)")
	List<?> getByDate(String fromDate,String toDate);
	
	
}
