package com.example.demo.service;

import com.example.demo.dto.ApplicationDetailsDTO;

import java.util.List;
import java.util.Map;

public interface ApplicationDetailsService {
	
    List<ApplicationDetailsDTO> getPOMemoList(
            Map<String, String> request
    );
}