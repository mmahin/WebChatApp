package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notifications")

public class Notifications {

	 @Id @GeneratedValue 
		private long  notificationsid;
		private long  senderid;
		private long  receiverid;
		private long  groupssid;
		private String type;
		private java.sql.Timestamp date;
		
		public long getNotificationsid() {
			return notificationsid;
		}
		public void setNotificationsid(long notificationsid) {
			this.notificationsid = notificationsid;
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
		public long getGroupssid() {
			return groupssid;
		}
		public void setGroupssid(long groupssid) {
			this.groupssid = groupssid;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public java.sql.Timestamp getDate() {
			return date;
		}
		public void setDate(java.sql.Timestamp date) {
			this.date = date;
		}
}
