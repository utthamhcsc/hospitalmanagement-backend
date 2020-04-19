package com.hms.management.repository;

import com.hms.management.model.Bed;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BedRepo extends JpaRepository<Bed, Integer> {
  @Query("SELECT new Map(b.id as id,b.name as name,t.name as bedTypeName,t.id as bedTypeId,g.id as bedGroupId,g.name as bedGroupName,b.isActive as isActive) FROM Bed b INNER JOIN BedGroup g ON g.id=b.bedGroupId INNER JOIN BedType t ON t.id=b.bedTypeId")
  List<?> fetchAll();
  
  @Query("SELECT new Map(b.id as id,b.name as name,t.name as bedTypeName,t.id as bedTypeId,g.id as bedGroupId,g.name as bedGroupName) FROM Bed b INNER JOIN BedGroup g ON g.id=b.bedGroupId INNER JOIN BedType t ON t.id=b.bedTypeId where b.bedGroupId=?1 AND b.isActive=?2")
  List<?> fetchByBedGrroupId(int paramInt1, int paramInt2);
}


/* Location:              C:\Users\Nagu\Downloads\WEB-INF\classes\!\com\hms\management\repository\BedRepo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */