package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ApplicationDetails;

@Repository
public interface ApplicationDetailsRepository
        extends JpaRepository<ApplicationDetails, Integer> {

}