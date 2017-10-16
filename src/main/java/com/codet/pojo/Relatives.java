package com.codet.pojo;

public class Relatives {
    private Integer relativesid;

    private Integer relativestypeid;

    private String name;

    private String phone1;

    private String phone2;

    private String info;

    private String wechat;

    public Integer getRelativesid() {
        return relativesid;
    }

    public void setRelativesid(Integer relativesid) {
        this.relativesid = relativesid;
    }

    public Integer getRelativestypeid() {
        return relativestypeid;
    }

    public void setRelativestypeid(Integer relativestypeid) {
        this.relativestypeid = relativestypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }
}