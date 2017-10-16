package com.codet.pojo;

public class Item {
    private Integer itemid;

    private Integer itemlevelid;

    private Integer itemtypeid;

    private String name;

    private String detail;

    private String pic;

    private Float price;

    private String benefitflag;

    private Integer flagnum;

    private Float benefitprice;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getItemlevelid() {
        return itemlevelid;
    }

    public void setItemlevelid(Integer itemlevelid) {
        this.itemlevelid = itemlevelid;
    }

    public Integer getItemtypeid() {
        return itemtypeid;
    }

    public void setItemtypeid(Integer itemtypeid) {
        this.itemtypeid = itemtypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBenefitflag() {
        return benefitflag;
    }

    public void setBenefitflag(String benefitflag) {
        this.benefitflag = benefitflag == null ? null : benefitflag.trim();
    }

    public Integer getFlagnum() {
        return flagnum;
    }

    public void setFlagnum(Integer flagnum) {
        this.flagnum = flagnum;
    }

    public Float getBenefitprice() {
        return benefitprice;
    }

    public void setBenefitprice(Float benefitprice) {
        this.benefitprice = benefitprice;
    }
}