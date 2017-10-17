package com.codet.pojo;

public class Drugandnum {
    private Integer drugandnumid;

    private String drugname;

    private String num;

    public Integer getDrugandnumid() {
        return drugandnumid;
    }

    public void setDrugandnumid(Integer drugandnumid) {
        this.drugandnumid = drugandnumid;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }
}