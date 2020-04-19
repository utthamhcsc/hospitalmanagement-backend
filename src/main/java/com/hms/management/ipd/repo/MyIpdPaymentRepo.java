package com.hms.management.ipd.repo;

import com.hms.management.ipd.modal.MyIpdPayment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyIpdPaymentRepo extends JpaRepository<MyIpdPayment, Integer> {
  List<MyIpdPayment> findByIpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\repo\MyIpdPaymentRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */