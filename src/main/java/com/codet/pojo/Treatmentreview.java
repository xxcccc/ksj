package com.codet.pojo;

public class Treatmentreview {
    private Integer ireatmentreviewid;

    private String review;

    public Integer getIreatmentreviewid() {
        return ireatmentreviewid;
    }

    public void setIreatmentreviewid(Integer ireatmentreviewid) {
        this.ireatmentreviewid = ireatmentreviewid;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }
}