package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {
}