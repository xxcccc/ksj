package com.codet.pojo;

import java.util.Date;

public class Consume {
    private Integer consumeid;

    private String customid;

    private Date createtime;

    private Date lastconsumetime;

    public Integer getConsumeid() {
        return consumeid;
    }

    public void setConsumeid(Integer consumeid) {
        this.consumeid = consumeid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastconsumetime() {
        return lastconsumetime;
    }

    public void setLastconsumetime(Date lastconsumetime) {
        this.lastconsumetime = lastconsumetime;
    }
}