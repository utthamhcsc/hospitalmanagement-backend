package com.hms.management.calander.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.calander.modal.CalenderEvent;

public interface CalenderEventRepo extends JpaRepository<CalenderEvent, Integer> {
	@Query("select c from CalenderEvent c where c.userId=?1 or c.status=?2")
	List<CalenderEvent> getByUserId(String userId,String status);

}
