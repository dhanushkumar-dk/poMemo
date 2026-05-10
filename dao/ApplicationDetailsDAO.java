package com.example.demo.dao;

import java.util.List;
import java.util.Map;

public interface ApplicationDetailsDAO {

    List<Map<String, Object>> getPOMemoList(
            String queryString,
            Map<String, String> request
    );
}