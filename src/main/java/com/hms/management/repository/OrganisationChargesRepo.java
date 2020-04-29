package com.hms.management.repository;

import com.hms.management.model.Setting_Charges;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationChargesRepo extends JpaRepository<Setting_Charges, Integer> {
  List<Setting_Charges> findByChargeTypeAndChargeCategory(String paramString1, String paramString2);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\repository\OrganisationChargesRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */