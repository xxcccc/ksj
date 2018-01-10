package com.codet.pojo;

import java.util.List;

/**
 * 
 * 客户查询的类
 * @author ran
 *
 */
public class CustomQueryPojo {
	
	private Custom custom;
	private CustomExtend customExtend;
	
	private int pageNo=0;
	private int pageSize=10;
	private int count;
	private String searchType="customId";
	private String keyword="";
	private int cityId=2;
	
	private List<CustomExtend> customExtends;
	
	//客户地址
	private List<Getaddress> getaddresses;
	
	
	
	
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public List<CustomExtend> getCustomExtends() {
		return customExtends;
	}

	public void setCustomExtends(List<CustomExtend> customExtends) {
		this.customExtends = customExtends;
	}

	public List<Getaddress> getGetaddresses() {
		return getaddresses;
	}

	public void setGetaddresses(List<Getaddress> getaddresses) {
		this.getaddresses = getaddresses;
	}

	public Custom getCustom() {
		return custom;
	}

	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	public CustomExtend getCustomExtend() {
		return customExtend;
	}

	public void setCustomExtend(CustomExtend customExtend) {
		this.customExtend = customExtend;
	}
	
}
