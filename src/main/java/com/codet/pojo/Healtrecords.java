package com.codet.pojo;

import java.util.Date;

public class Healtrecords {
    private Integer healtrecordsid;

    private Integer healthconsciousnessid;

    private Integer ireatmentreviewid;

    private String customid;

    private Date diagnosistime;

    private String familyhistory;

    private Integer height;

    private Double weight;

    private String job;

    public Integer getHealtrecordsid() {
        return healtrecordsid;
    }

    public void setHealtrecordsid(Integer healtrecordsid) {
        this.healtrecordsid = healtrecordsid;
    }

    public Integer getHealthconsciousnessid() {
        return healthconsciousnessid;
    }

    public void setHealthconsciousnessid(Integer healthconsciousnessid) {
        this.healthconsciousnessid = healthconsciousnessid;
    }

    public Integer getIreatmentreviewid() {
        return ireatmentreviewid;
    }

    public void setIreatmentreviewid(Integer ireatmentreviewid) {
        this.ireatmentreviewid = ireatmentreviewid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getFamilyhistory() {
        return familyhistory;
    }

    public void setFamilyhistory(String familyhistory) {
        this.familyhistory = familyhistory == null ? null : familyhistory.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }
}