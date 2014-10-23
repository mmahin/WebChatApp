package test.java.models;

import java.sql.Timestamp;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.mahin.models.Usermsg;

import junit.framework.TestCase;

public class UsermsgTest extends TestCase{
	private Usermsg usermsg;
	
	 protected void setUp() throws Exception {
		 usermsg = new Usermsg();
	    }
	 public void testSetAndGetUsermsgid() {
	        long testUsermsgid = 1;
	        usermsg.setUsermsgid(1);
	        assertEquals(testUsermsgid, usermsg.getUsermsgid());
	    }

	    public void testSetAndGetReceiverid() {  
	    long testReceiverid = 1;
	    usermsg.setReceiverid(1);
     assertEquals(testReceiverid, usermsg.getReceiverid());
     }
	    
	    public void testSetAndGetMessage() {  
		    String testMessage = "hi";
		    usermsg.setMessage("hi");
	        assertEquals(testMessage, usermsg.getMessage());
	        }
	    
	    public void testSetAndGetSendtime() {  
	    	java.sql.Timestamp testSendtime = new Timestamp(new DateTime(2007, 9, 23, 0, 0, 0, 0, DateTimeZone.forID( "America/Montreal" )).getMillis());
	    	usermsg.setSendtime(testSendtime);
	        assertEquals(testSendtime, usermsg.getSendtime());
	        }
	    public void testSetAndGetReadtime() {  
	    	java.sql.Timestamp testReadtime = new Timestamp(new DateTime(2007, 10, 23, 0, 0, 0, 0, DateTimeZone.forID( "America/Montreal" )).getMillis());
	    	usermsg.setReadtime(testReadtime);
	        assertEquals(testReadtime, usermsg.getReadtime());
	        }
	    
	    public void testSetAndGetSenderid() {  
		    long testSenderid = 2;
		    usermsg.setSenderid(2);
	        assertEquals(testSenderid, usermsg.getSenderid());
	        }

}
