package com.codet.pojo;

import java.util.Date;

public class Interview {
    private Integer id;

    private Integer userid;

    private String customid;

    private Date lastinterviewtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public Date getLastinterviewtime() {
        return lastinterviewtime;
    }

    public void setLastinterviewtime(Date lastinterviewtime) {
        this.lastinterviewtime = lastinterviewtime;
    }
}