package com.codet.pojo;

public class Physicalconditiontype {
    private Integer physicalconditiontypeid;

    private String name;

    public Integer getPhysicalconditiontypeid() {
        return physicalconditiontypeid;
    }

    public void setPhysicalconditiontypeid(Integer physicalconditiontypeid) {
        this.physicalconditiontypeid = physicalconditiontypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}