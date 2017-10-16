package com.codet.pojo;

public class Collection {
    private Integer conllectionid;

    private String customid;

    private Integer itemid;

    public Integer getConllectionid() {
        return conllectionid;
    }

    public void setConllectionid(Integer conllectionid) {
        this.conllectionid = conllectionid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }
}