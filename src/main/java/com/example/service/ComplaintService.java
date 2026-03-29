package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.model.Complaint;
import com.example.repository.ComplaintRepository;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository repo;

    public Complaint addComplaint(Complaint c) {
        return repo.save(c);
    }

    public List<Complaint> getAll() {
        return repo.findAll();
    }

    public void resolve(int id) {
        Complaint c = repo.findById(id).orElse(null);
        if(c != null) {
            c.setStatus("Resolved");
            repo.save(c);
        }
    }
}