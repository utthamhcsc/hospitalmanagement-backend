package com.hms.management.opd.Repo;

import com.hms.management.opd.modal.MyOpdPayment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyOpdPaymentRepo extends JpaRepository<MyOpdPayment, Integer> {
  List<MyOpdPayment> findByOpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\Repo\MyOpdPaymentRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */