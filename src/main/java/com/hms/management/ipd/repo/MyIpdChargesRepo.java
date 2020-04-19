package com.hms.management.ipd.repo;

import com.hms.management.ipd.modal.MyIpdCharges;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyIpdChargesRepo extends JpaRepository<MyIpdCharges, Integer> {
  List<MyIpdCharges> findByIpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\repo\MyIpdChargesRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */