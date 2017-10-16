package com.codet.pojo;

import java.util.Date;

public class Reply {
    private Integer replayid;

    private Integer userid;

    private Integer evaluetaid;

    private Integer repreplayid;

    private String detial;

    private Date createtime;

    public Integer getReplayid() {
        return replayid;
    }

    public void setReplayid(Integer replayid) {
        this.replayid = replayid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getEvaluetaid() {
        return evaluetaid;
    }

    public void setEvaluetaid(Integer evaluetaid) {
        this.evaluetaid = evaluetaid;
    }

    public Integer getRepreplayid() {
        return repreplayid;
    }

    public void setRepreplayid(Integer repreplayid) {
        this.repreplayid = repreplayid;
    }

    public String getDetial() {
        return detial;
    }

    public void setDetial(String detial) {
        this.detial = detial == null ? null : detial.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}