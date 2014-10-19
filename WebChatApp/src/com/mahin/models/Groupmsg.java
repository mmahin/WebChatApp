package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="groupmsg")

public class Groupmsg {

	  @Id @GeneratedValue
	  private long groupmsgid;
	  private long groupsid;
	  private long userid;
	  private String message;
	  private java.sql.Timestamp sendtime;
	  
	public long getGroupmsgid() {
		return groupmsgid;
	}
	public void setGroupmsgid(long groupmsgid) {
		this.groupmsgid = groupmsgid;
	}
	public long getGroupsid() {
		return groupsid;
	}
	public void setGroupsid(long groupsid) {
		this.groupsid = groupsid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public java.sql.Timestamp getSendtime() {
		return sendtime;
	}
	public void setSendtime(java.sql.Timestamp sendtime) {
		this.sendtime = sendtime;
	}
	
}
