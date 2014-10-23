package test.java.models;

import java.sql.Timestamp;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import junit.framework.TestCase;


import com.mahin.models.Groupmsg;

public class GroupmsgTest extends TestCase{
        private  Groupmsg groupmsg;
        
        protected void setUp() throws Exception {
        	groupmsg = new Groupmsg();
	    }

		public void testSetAndGetGroupmsgid() {
	        long testGroupmsgid = 1;
	        groupmsg.setGroupmsgid(1);
	        assertEquals(testGroupmsgid, groupmsg.getGroupmsgid());
	    }

	    public void testSetAndGetGroupsid() {  
	    long testGroupsid = 1;
	    groupmsg.setGroupsid(1);
        assertEquals(testGroupsid, groupmsg.getGroupsid());
        }
	    
	    public void testSetAndGetMessage() {  
		    String testMessage = "hi";
		    groupmsg.setMessage("hi");
	        assertEquals(testMessage, groupmsg.getMessage());
	        }
	    
	    public void testSetAndGetSendtime() {  
	    	java.sql.Timestamp testSendtime = new Timestamp(new DateTime(2007, 9, 23, 0, 0, 0, 0, DateTimeZone.forID( "America/Montreal" )).getMillis());
	    	groupmsg.setSendtime(testSendtime);
	        assertEquals(testSendtime, groupmsg.getSendtime());
	        }
	    
	    public void testSetAndGetUserid() {  
		    long testUserid = 2;
		    groupmsg.setUserid(2);
	        assertEquals(testUserid, groupmsg.getUserid());
	        }
}
