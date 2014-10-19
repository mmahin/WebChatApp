package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grouponline")

public class Grouponline {

	 @Id @GeneratedValue
	  private long grouponlineid;
	  private long groupsid;
	  private long userid;
	  
	public long getGrouponlineid() {
		return grouponlineid;
	}
	public void setGrouponlineid(long grouponlineid) {
		this.grouponlineid = grouponlineid;
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
	 
}
