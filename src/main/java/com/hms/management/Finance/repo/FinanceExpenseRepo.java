package com.hms.management.Finance.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.Finance.modal.FinanceExpenseHead;

public interface FinanceExpenseRepo extends JpaRepository<FinanceExpenseHead, Integer> {
	@Query("select new Map(p as p,i.expenseHead as expenseHead) "
			+ "from FinanceExpenseHead p inner join ExpenseHead i on i.id=p.expenseHeadId")
	List<?> fetchAll();
	@Query("select new Map(p as p,i.expenseHead as expenseHead) "
			+ "from FinanceExpenseHead p inner join ExpenseHead i on i.id=p.expenseHeadId"
			+ " where p.date between SUBSTRING(?1,1,10) AND SUBSTRING(?2,1,10)")
	List<?> getbydate(String fromDate, String toDate);
}
