package com.example.demo.serviceImpl;

import com.example.demo.dao.ApplicationDetailsDAO;
import com.example.demo.service.ApplicationDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class ApplicationDetailsServiceImpl
        implements ApplicationDetailsService {

    @Autowired
    private ApplicationDetailsDAO applicationDetailsDAO;



    @SuppressWarnings("unchecked")
	@Override
    public List getPOMemoList( Map<String, String> request ) {

        StringBuilder queryBuilder = new StringBuilder();




        queryBuilder
                .append(" SELECT ")
                .append("     APPLICATION_ID, ")
                .append("     ELEMENT_ID, ")
                .append("     ELEMENT_VALUE ")
                .append(" FROM APPLICATION_DETAILS lad ")
                .append(" WHERE lad.APPLICATION_ID IN ( ")

                .append("     SELECT APPLICATION_ID ")
                .append("     FROM APPLICATION_DETAILS ")
                .append("     GROUP BY APPLICATION_ID ")
                .append("     HAVING ")

                // Mandatory Filters

                .append(" MAX(CASE ")
                .append("     WHEN ELEMENT_ID = 'companyCode' ")
                .append("     AND ELEMENT_VALUE = :companyCode ")
                .append("     THEN 1 ELSE 0 END) = 1 ")

                .append(" AND MAX(CASE ")
                .append("     WHEN ELEMENT_ID = 'loanType' ")
                .append("     AND ELEMENT_VALUE = :loanType ")
                .append("     THEN 1 ELSE 0 END) = 1 ")

                .append(" AND MAX(CASE ")
                .append("     WHEN ELEMENT_ID = 'poGenerated' ")
                .append("     AND ELEMENT_VALUE = :poGenerated ")
                .append("     THEN 1 ELSE 0 END) = 1 ")

                .append(" AND MAX(CASE ")
                .append("     WHEN ELEMENT_ID = 'contract' ")
                .append("     AND ELEMENT_VALUE IS NOT NULL ")
                .append("     THEN 1 ELSE 0 END) = 1 ")

                .append(" AND MAX(CASE ")
                .append("     WHEN ELEMENT_ID = 'applicationStatus' ")
                .append("     AND ELEMENT_VALUE = 'B' ")
                .append("     THEN 1 ELSE 0 END) = 1 ");




        // Optional Filters

        if (request.get("customerName") != null) {

            queryBuilder
                    .append(" AND MAX(CASE ")
                    .append("     WHEN ELEMENT_ID = 'customerName' ")
                    .append("     AND ELEMENT_VALUE LIKE :customerName ")
                    .append("     THEN 1 ELSE 0 END) = 1 ");
        }

        if (request.get("customerId") != null) {

            queryBuilder
                    .append(" AND MAX(CASE ")
                    .append("     WHEN ELEMENT_ID = 'customerId' ")
                    .append("     AND ELEMENT_VALUE = :customerId ")
                    .append("     THEN 1 ELSE 0 END) = 1 ");
        }

        if (request.get("applicationId") != null) {

            queryBuilder
                    .append(" AND MAX(CASE ")
                    .append("     WHEN ELEMENT_ID = 'applicationId' ")
                    .append("     AND ELEMENT_VALUE = :applicationId ")
                    .append("     THEN 1 ELSE 0 END) = 1 ");
        }

        if (request.get("contract") != null) {

            queryBuilder
                    .append(" AND MAX(CASE ")
                    .append("     WHEN ELEMENT_ID = 'contract' ")
                    .append("     AND ELEMENT_VALUE = :contract ")
                    .append("     THEN 1 ELSE 0 END) = 1 ");
        }

        if (request.get("mobile") != null) {

            queryBuilder
                    .append(" AND MAX(CASE ")
                    .append("     WHEN ELEMENT_ID = 'mobile' ")
                    .append("     AND ELEMENT_VALUE = :mobile ")
                    .append("     THEN 1 ELSE 0 END) = 1 ");
        }

        queryBuilder.append(" ) ");




        return applicationDetailsDAO.getPOMemoList(
                queryBuilder.toString(),
                request
        );
    }
}