package com.codet.pojo;

import java.util.Date;

public class Custom {
    private String customid;

    private String customname;

    private String name;

    private String phone;

    private String sex;

    private Date birthday;

    private String address;

    private String pic;

    private String wechat;

    private String password;

	public String getCustomid() {
		return customid;
	}

	public void setCustomid(String customid) {
		this.customid = customid;
	}

	public String getCustomname() {
		return customname;
	}

	public void setCustomname(String customname) {
		this.customname = customname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Custom [customid=" + customid + ", customname=" + customname
				+ ", name=" + name + ", phone=" + phone + ", sex=" + sex
				+ ", birthday=" + birthday + ", address=" + address + ", pic="
				+ pic + ", wechat=" + wechat + ", password=" + password + "]";
	}

   
}