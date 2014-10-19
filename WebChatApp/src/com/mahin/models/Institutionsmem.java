package com.mahin.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institutionsmem")

public class Institutionsmem {

	@Id @GeneratedValue
	  private long institutionsmemid;
	  private long userid;
	  private long institutionsid;
	  private Date startdate;
	  private Date enddate;
	  
	public long getInstitutionsmemid() {
		return institutionsmemid;
	}
	public void setInstitutionsmemid(long institutionsmemid) {
		this.institutionsmemid = institutionsmemid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getInstitutionsid() {
		return institutionsid;
	}
	public void setInstitutionsid(long institutionsid) {
		this.institutionsid = institutionsid;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	  
}
