package com.hms.management.opd.Repo;

import com.hms.management.opd.modal.MyOpdDiagnosis;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyOpdDiagnosisRepo extends JpaRepository<MyOpdDiagnosis, String> {
  @Query("Select m from MyOpdDiagnosis m where m.opdId=?1")
  List<MyOpdDiagnosis> fetchByOpdId(String paramString);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\opd\Repo\MyOpdDiagnosisRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */