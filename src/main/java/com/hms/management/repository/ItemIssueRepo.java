package com.hms.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.management.model.ItemIssue;

public interface ItemIssueRepo extends JpaRepository<ItemIssue, Integer>{

}