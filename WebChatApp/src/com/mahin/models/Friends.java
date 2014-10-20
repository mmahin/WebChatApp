package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friends")
public class Friends {
	
  @Id @GeneratedValue
 private long friendid;
  private long reqsender;
  private long reqreceiver;
  private int rank;
  private boolean granted;
 public long getFriendid() {
	return friendid;
}
public void setFriendid(long friendid) {
	this.friendid = friendid;
}
public long getReqsender() {
	return reqsender;
}
public void setReqsender(long reqsender) {
	this.reqsender = reqsender;
}
public long getReqreceiver() {
	return reqreceiver;
}
public void setReqreceiver(long reqreceiver) {
	this.reqreceiver = reqreceiver;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}
public boolean getGranted() {
	return granted;
}
public void setGranted(boolean granted) {
	this.granted = granted;
}


 
}
