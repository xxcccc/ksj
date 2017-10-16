package com.codet.pojo;

public class Relativestype {
    private Integer relativestypeid;

    private String type;

    public Integer getRelativestypeid() {
        return relativestypeid;
    }

    public void setRelativestypeid(Integer relativestypeid) {
        this.relativestypeid = relativestypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}