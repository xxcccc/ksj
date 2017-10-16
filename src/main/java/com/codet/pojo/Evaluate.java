package com.codet.pojo;

import java.util.Date;

public class Evaluate {
    private Integer evaluetaid;

    private Integer evaluetalevelid;

    private Date createtime;

    private String detail;

    private String pic;

    public Integer getEvaluetaid() {
        return evaluetaid;
    }

    public void setEvaluetaid(Integer evaluetaid) {
        this.evaluetaid = evaluetaid;
    }

    public Integer getEvaluetalevelid() {
        return evaluetalevelid;
    }

    public void setEvaluetalevelid(Integer evaluetalevelid) {
        this.evaluetalevelid = evaluetalevelid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
}