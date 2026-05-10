package com.example.demo.daoImpl;

import com.example.demo.dao.ApplicationDetailsDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ApplicationDetailsDAOImpl implements ApplicationDetailsDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Map<String, Object>> getPOMemoList(String queryString, Map<String, String> request) {

		Query query = entityManager.createNativeQuery(queryString);

		// Set Parameters

		for (Map.Entry<String, String> entry : request.entrySet()) {

			if (entry.getValue() != null && !entry.getValue().trim().isEmpty()) {

				if (entry.getKey().equals("customerName")) {

					query.setParameter(entry.getKey(), "%" + entry.getValue() + "%");
				}

				else {

					query.setParameter(entry.getKey(), entry.getValue());
				}
			}
		}

		List<Object[]> resultList = query.getResultList();

		/*
		 * Final Response Format:
		 * 
		 * [ { customerName : Rajesh, customerId : CS00001 }, { customerName : Kamalesh
		 * } ]
		 */

		Map<String, Map<String, Object>> groupedApplications = new LinkedHashMap<>();

		for (Object[] row : resultList) {

			String applicationId = (String) row[0];

			String elementId = (String) row[1];

			String elementValue = (String) row[2];

			if (!groupedApplications.containsKey(applicationId)) {

				groupedApplications.put(applicationId, new LinkedHashMap<>());
			}

			groupedApplications.get(applicationId).put(elementId, elementValue);
		}

		return new ArrayList<>(groupedApplications.values());
	}
}