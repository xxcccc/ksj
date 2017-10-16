package com.codet.pojo;

import java.util.Date;

public class Browse {
    private Integer browseid;

    private String customid;

    private Integer itemtypeid;

    private Date createtime;

    public Integer getBrowseid() {
        return browseid;
    }

    public void setBrowseid(Integer browseid) {
        this.browseid = browseid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public Integer getItemtypeid() {
        return itemtypeid;
    }

    public void setItemtypeid(Integer itemtypeid) {
        this.itemtypeid = itemtypeid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}