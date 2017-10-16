package com.codet.pojo;

import java.util.Date;

public class Healthyproject {
    private Integer healthyprojectid;

    private Integer projecttimearrangetypeid;

    private String name;

    private String detail;

    private String pic;

    private Integer maxservernum;

    private String flag;

    private Date starttime;

    private Date overtime;

    public Integer getHealthyprojectid() {
        return healthyprojectid;
    }

    public void setHealthyprojectid(Integer healthyprojectid) {
        this.healthyprojectid = healthyprojectid;
    }

    public Integer getProjecttimearrangetypeid() {
        return projecttimearrangetypeid;
    }

    public void setProjecttimearrangetypeid(Integer projecttimearrangetypeid) {
        this.projecttimearrangetypeid = projecttimearrangetypeid;
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

    public Integer getMaxservernum() {
        return maxservernum;
    }

    public void setMaxservernum(Integer maxservernum) {
        this.maxservernum = maxservernum;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }
}