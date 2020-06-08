package com.hms.management.messaging.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.messaging.model.MyMessage;

public interface MyMessageRepo extends JpaRepository<MyMessage, Integer> {
	@Query(" select m from "
			+ "MyMessage m join m.messageTo s where s.role=?1")
	List<MyMessage> fetchbyrole(String role);

}
