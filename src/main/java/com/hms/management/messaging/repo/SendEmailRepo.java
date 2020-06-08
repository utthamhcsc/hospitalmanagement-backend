package com.hms.management.messaging.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.management.messaging.model.SendEmail;

public interface SendEmailRepo extends JpaRepository<SendEmail, Integer> {

}
