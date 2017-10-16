package com.codet.pojo;

public class Getaddress {
    private Integer getaddressid;

    private String customid;

    private String name;

    private String phone;

    private String getaddress;

    private String detail;

    public Integer getGetaddressid() {
        return getaddressid;
    }

    public void setGetaddressid(Integer getaddressid) {
        this.getaddressid = getaddressid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getGetaddress() {
        return getaddress;
    }

    public void setGetaddress(String getaddress) {
        this.getaddress = getaddress == null ? null : getaddress.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}