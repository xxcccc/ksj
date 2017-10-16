package com.codet.pojo;

public class Healthyprojecttimearrangetype {
    private Integer projecttimearrangetypeid;

    private String type;

    public Integer getProjecttimearrangetypeid() {
        return projecttimearrangetypeid;
    }

    public void setProjecttimearrangetypeid(Integer projecttimearrangetypeid) {
        this.projecttimearrangetypeid = projecttimearrangetypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}