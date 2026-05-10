package com.example.demo.dto;

public class ApplicationDetailsDTO {

    private Integer siNo;

    private String applicationId;

    private String elementId;

    private String elementValue;

    private String elementType;

    private String elementSubType;

    private String companyCode;

    private String applicantType;

    private Integer applicantTypeSeq;




    // Default Constructor

    public ApplicationDetailsDTO() {
    }




    // Parameterized Constructor

    public ApplicationDetailsDTO(
            Integer siNo,
            String applicationId,
            String elementId,
            String elementValue,
            String elementType,
            String elementSubType,
            String companyCode,
            String applicantType,
            Integer applicantTypeSeq
    ) {
        this.siNo = siNo;
        this.applicationId = applicationId;
        this.elementId = elementId;
        this.elementValue = elementValue;
        this.elementType = elementType;
        this.elementSubType = elementSubType;
        this.companyCode = companyCode;
        this.applicantType = applicantType;
        this.applicantTypeSeq = applicantTypeSeq;
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
        return "ApplicationDetailsDTO{" +
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