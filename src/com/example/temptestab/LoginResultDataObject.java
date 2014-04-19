package com.example.temptestab;

import java.util.List;

public class LoginResultDataObject {
	private String sid;

	private String uname;

	private Integer UID;
	
	private String serialnumber;


	public String getSerialnumber() {
		return serialnumber;
	}


	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}


	LoginResultDataObject() {

	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public Integer getUID() {
		return UID;
	}


	public void setUID(Integer uID) {
		UID = uID;
	}

}
