package com.codet.pojo;

public class Orderdetail {
    private Integer orderdetailid;

    private Integer torderid;

    private Integer itemid;

    private Integer num;

    private Float sumprice;

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public Integer getTorderid() {
        return torderid;
    }

    public void setTorderid(Integer torderid) {
        this.torderid = torderid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getSumprice() {
        return sumprice;
    }

    public void setSumprice(Float sumprice) {
        this.sumprice = sumprice;
    }
}