package com.codet.pojo;

public class Level {
    private Integer levelid;

    private String name;

    private Integer integral;

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}