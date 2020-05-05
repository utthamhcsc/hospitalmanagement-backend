package com.hms.management.Finance.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.Finance.modal.FinanceIncomeHead;

public interface FinanceIncomeRepo extends JpaRepository<FinanceIncomeHead, Integer> {
	@Query("select new Map(p as p,i.incomeHead as incomeHead) "
			+ "from FinanceIncomeHead p inner join IncomeHead i on i.id=p.incomeHeadId")
	List<?> fetchAll();
	@Query("select new Map(p as p,i.incomeHead as incomeHead) "
			+ "from FinanceIncomeHead p inner join IncomeHead i on i.id=p.incomeHeadId"
			+ " where p.date between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<?> getbydate(String fromDate, String toDate);

}
