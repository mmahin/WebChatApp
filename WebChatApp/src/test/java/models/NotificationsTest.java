package test.java.models;

import java.sql.Timestamp;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.mahin.models.Notifications;

import junit.framework.TestCase;

public class NotificationsTest extends TestCase{

	private  Notifications notification;
	
	protected void setUp() throws Exception {
		notification = new Notifications();
	    }
	  public void testSetAndGetDate() {  
	    	java.sql.Timestamp testDate = new Timestamp(new DateTime(2007, 9, 23, 0, 0, 0, 0, DateTimeZone.forID( "America/Montreal" )).getMillis());
	    	notification.setDate(testDate);
	        assertEquals(testDate, notification.getDate());
	        }
	  public void testSetAndGetNotificationsid() {  
		    long testNotificationsid = 1;
		    notification.setNotificationsid(1);
	      assertEquals(testNotificationsid, notification.getNotificationsid());
	      }
	  public void testSetAndGetReceiverid() {  
		    long testReceiverid = 1;
		    notification.setReceiverid(1);
	      assertEquals(testReceiverid, notification.getReceiverid());
	      }
	  public void testSetAndGetSenderid() {  
		    long testSenderid = 1;
		    notification.setSenderid(1);
	      assertEquals(testSenderid, notification.getSenderid());
	      }
	  public void testSetAndGetGroupsid() {  
		    long testGroupsid = 1;
		    notification.setGroupsid(1);
	      assertEquals(testGroupsid, notification.getGroupsid());
	      }
	  public void testSetAndGetType() {  
		    String testType = "hi";
		    notification.setType("hi");
	        assertEquals(testType, notification.getType());
	        }
}
