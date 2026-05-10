package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "APPLICATION_DETAILS")
public class ApplicationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SI_NO")
    private Integer siNo;

    @Column(name = "APPLICATION_ID", nullable = false, length = 20)
    private String applicationId;

    @Column(name = "ELEMENT_ID", nullable = false, length = 50)
    private String elementId;

    @Column(name = "ELEMENT_VALUE", nullable = false, length = 100)
    private String elementValue;

    @Column(name = "ELEMENT_TYPE", length = 20)
    private String elementType;

    @Column(name = "ELEMENT_SUB_TYPE", length = 20)
    private String elementSubType;

    @Column(name = "COMPANY_CODE", nullable = false, length = 10)
    private String companyCode;

    @Column(name = "APPLICANT_TYPE", nullable = false, length = 5)
    private String applicantType;

    @Column(name = "APPLICANT_TYPE_SEQ", nullable = false)
    private Integer applicantTypeSeq;




    // Default Constructor

    public ApplicationDetails() {
    }




    // Getters and Setters

    public Integer getSiNo() {
        return siNo;
    }

    public void setSiNo(Integer siNo) {
        this.siNo = siNo;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getElementValue() {
        return elementValue;
    }

    public void setElementValue(String elementValue) {
        this.elementValue = elementValue;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getElementSubType() {
        return elementSubType;
    }

    public void setElementSubType(String elementSubType) {
        this.elementSubType = elementSubType;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }

    public Integer getApplicantTypeSeq() {
        return applicantTypeSeq;
    }

    public void setApplicantTypeSeq(Integer applicantTypeSeq) {
        this.applicantTypeSeq = applicantTypeSeq;
    }




    @Override
    public String toString() {
        return "ApplicationDetails{" +
                "siNo=" + siNo +
                ", applicationId='" + applicationId + '\'' +
                ", elementId='" + elementId + '\'' +
                ", elementValue='" + elementValue + '\'' +
                ", elementType='" + elementType + '\'' +
                ", elementSubType='" + elementSubType + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", applicantType='" + applicantType + '\'' +
                ", applicantTypeSeq=" + applicantTypeSeq +
                '}';
    }
}