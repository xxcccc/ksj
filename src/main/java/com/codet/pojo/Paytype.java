package com.codet.pojo;

public class Paytype {
    private Integer paytypeid;

    private String type;

    public Integer getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(Integer paytypeid) {
        this.paytypeid = paytypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}