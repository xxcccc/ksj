package com.codet.pojo;

public class Interviewtype {
    private Integer interviewtypeid;

    private String type;

    public Integer getInterviewtypeid() {
        return interviewtypeid;
    }

    public void setInterviewtypeid(Integer interviewtypeid) {
        this.interviewtypeid = interviewtypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}