package com.codet.pojo;

public class Itemlevel {
    private Integer itemlevelid;

    private String level;

    public Integer getItemlevelid() {
        return itemlevelid;
    }

    public void setItemlevelid(Integer itemlevelid) {
        this.itemlevelid = itemlevelid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }
}