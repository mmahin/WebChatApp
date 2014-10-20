package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="groupmem")
public class Groupmem {

	  @Id @GeneratedValue
	private long groupmemid;
	private long userid;
	private long groupsid;
	private String role;
	private boolean ismember;
	
	public long getGroupmemid() {
		return groupmemid;
	}
	public void setGroupmemid(long groupmemid) {
		this.groupmemid = groupmemid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getGroupsid() {
		return groupsid;
	}
	public void setGroupsid(long groupsid) {
		this.groupsid = groupsid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean getIsmember() {
		return ismember;
	}
	public void setIsmember(boolean ismember) {
		this.ismember = ismember;
	}
	



}
