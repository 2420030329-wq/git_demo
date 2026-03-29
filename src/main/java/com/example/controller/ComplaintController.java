package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.model.Complaint;
import com.example.service.ComplaintService;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "*")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @PostMapping("/add")
    public Complaint add(@RequestBody Complaint c) {
        return service.addComplaint(c);
    }

    @GetMapping("/all")
    public List<Complaint> all() {
        return service.getAll();
    }

    @PutMapping("/resolve/{id}")
    public String resolve(@PathVariable int id) {
        service.resolve(id);
        return "Resolved";
    }
}