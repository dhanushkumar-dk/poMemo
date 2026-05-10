package com.example.demo.controller;

import com.example.demo.dto.ApplicationDetailsDTO;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/application")
public class ApplicationDetailsController {

    @Autowired
    private ApplicationDetailsService applicationDetailsService;



    @PostMapping("/search")
    public ResponseEntity<List<ApplicationDetailsDTO>> searchApplications(
            @RequestBody Map<String, String> request
    ) {

        List<ApplicationDetailsDTO> response =
                applicationDetailsService.getPOMemoList(request);

        return ResponseEntity.ok(response);
    }
}