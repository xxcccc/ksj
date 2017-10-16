package com.codet.pojo;

import java.util.Date;

public class Consumedetail {
    private Integer consumedetailid;

    private Integer consumeid;

    private Integer consumecycleid;

    private Date createtime;

    private Integer consume;

    private Integer consumenum;

    public Integer getConsumedetailid() {
        return consumedetailid;
    }

    public void setConsumedetailid(Integer consumedetailid) {
        this.consumedetailid = consumedetailid;
    }

    public Integer getConsumeid() {
        return consumeid;
    }

    public void setConsumeid(Integer consumeid) {
        this.consumeid = consumeid;
    }

    public Integer getConsumecycleid() {
        return consumecycleid;
    }

    public void setConsumecycleid(Integer consumecycleid) {
        this.consumecycleid = consumecycleid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    public Integer getConsumenum() {
        return consumenum;
    }

    public void setConsumenum(Integer consumenum) {
        this.consumenum = consumenum;
    }
}