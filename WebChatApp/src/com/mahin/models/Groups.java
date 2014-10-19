package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="groups")

public class Groups {

	@Id @GeneratedValue
	  private long groupsid;
	  private String groupsname;
	  private String description;
	  
	public long getGroupsid() {
		return groupsid;
	}
	public void setGroupsid(long groupsid) {
		this.groupsid = groupsid;
	}
	public String getGroupsname() {
		return groupsname;
	}
	public void setGroupsname(String groupsname) {
		this.groupsname = groupsname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	  
}
