package com.codet.pojo;

public class Diseasetype {
    private Integer diseasetypeid;

    private String name;

    private String detail;

    public Integer getDiseasetypeid() {
        return diseasetypeid;
    }

    public void setDiseasetypeid(Integer diseasetypeid) {
        this.diseasetypeid = diseasetypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}