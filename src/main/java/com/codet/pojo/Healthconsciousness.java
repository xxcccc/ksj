package com.codet.pojo;

public class Healthconsciousness {
    private Integer healthconsciousnessid;

    private String name;

    public Integer getHealthconsciousnessid() {
        return healthconsciousnessid;
    }

    public void setHealthconsciousnessid(Integer healthconsciousnessid) {
        this.healthconsciousnessid = healthconsciousnessid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}