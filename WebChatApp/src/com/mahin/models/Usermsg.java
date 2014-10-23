package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
@Entity
@Table(name="usermsg")

public class Usermsg {
	
	@Id @GeneratedValue
	  private long usermsgid;
	  private long senderid;
	  private long receiverid;
	  private String message;
	  private Timestamp sendtime;
	  private Timestamp readtime;
	public long getUsermsgid() {
		return usermsgid;
	}
	public void setUsermsgid(long usermsgid) {
		this.usermsgid = usermsgid;
	}
	public long getSenderid() {
		return senderid;
	}
	public void setSenderid(long senderid) {
		this.senderid = senderid;
	}
	public long getReceiverid() {
		return receiverid;
	}
	public void setReceiverid(long receiverid) {
		this.receiverid = receiverid;
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
	public void setSendtime(Timestamp sendtime) {
		this.sendtime = sendtime;
	}
	public Timestamp getReadtime() {
		return readtime;
	}
	public void setReadtime(Timestamp readtime) {
		this.readtime = readtime;
	}

	  

}
