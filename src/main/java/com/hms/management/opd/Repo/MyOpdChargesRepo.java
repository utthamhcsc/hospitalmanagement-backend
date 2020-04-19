package com.hms.management.opd.Repo;

import com.hms.management.opd.modal.MyOpdCharges;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyOpdChargesRepo extends JpaRepository<MyOpdCharges, Integer> {
  List<MyOpdCharges> findByOpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\Repo\MyOpdChargesRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */