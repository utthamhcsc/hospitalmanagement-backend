package com.hms.management.ipd.repo;

import com.hms.management.ipd.modal.MyIpdDiagnosis;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyIpdDiagnosisRepo extends JpaRepository<MyIpdDiagnosis, Integer> {
  @Query("Select m from MyIpdDiagnosis m where m.ipdId=?1")
  List<MyIpdDiagnosis> fetchByIpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\ipd\repo\MyIpdDiagnosisRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */