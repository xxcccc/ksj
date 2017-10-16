package com.codet.pojo;

public class Costomitemrecommend {
    private Integer customitemrecommendid;

    private String customid;

    public Integer getCustomitemrecommendid() {
        return customitemrecommendid;
    }

    public void setCustomitemrecommendid(Integer customitemrecommendid) {
        this.customitemrecommendid = customitemrecommendid;
    }

    public String getCustomid() {
        return customid;
    }

    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }
}