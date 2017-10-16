package com.codet.pojo;

import java.util.Date;

public class Healthyprojectorder {
    private Integer healthyprojectorderid;

    private String customid;

    private Integer healthyprojectdayarrangeid;

    private Date time;

    public Integer getHealthyprojectorderid() {
        return healthyprojectorderid;
    }

    public void setHealthyprojectorderid(Integer healthyprojectorderid) {
        this.healthyprojectorderid = healthyprojectorderid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public Integer getHealthyprojectdayarrangeid() {
        return healthyprojectdayarrangeid;
    }

    public void setHealthyprojectdayarrangeid(Integer healthyprojectdayarrangeid) {
        this.healthyprojectdayarrangeid = healthyprojectdayarrangeid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}