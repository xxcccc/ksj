package com.codet.pojo;

public class Consumecycle {
    private Integer consumecycleid;

    private String cycle;

    public Integer getConsumecycleid() {
        return consumecycleid;
    }

    public void setConsumecycleid(Integer consumecycleid) {
        this.consumecycleid = consumecycleid;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }
}