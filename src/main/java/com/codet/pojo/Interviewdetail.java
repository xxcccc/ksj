package com.codet.pojo;

import java.util.Date;

public class Interviewdetail {
    private Integer interviewdetailid;

    private Integer interviewtypeid;

    private Integer id;

    private Date time;

    private String detail;

    private Integer result;

    private Integer type;

    public Integer getInterviewdetailid() {
        return interviewdetailid;
    }

    public void setInterviewdetailid(Integer interviewdetailid) {
        this.interviewdetailid = interviewdetailid;
    }

    public Integer getInterviewtypeid() {
        return interviewtypeid;
    }

    public void setInterviewtypeid(Integer interviewtypeid) {
        this.interviewtypeid = interviewtypeid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}