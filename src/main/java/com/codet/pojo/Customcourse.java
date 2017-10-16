package com.codet.pojo;

public class Customcourse {
    private Integer customcourseid;

    private String customid;

    private Integer courseid;

    public Integer getCustomcourseid() {
        return customcourseid;
    }

    public void setCustomcourseid(Integer customcourseid) {
        this.customcourseid = customcourseid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }
}