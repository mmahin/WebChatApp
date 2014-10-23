package test.java.models;

import com.mahin.models.Friends;

import junit.framework.TestCase;

public class FriendsTest extends TestCase  {

	    private Friends friends;

	    protected void setUp() throws Exception {
	        friends = new Friends();
	    }

		public void testSetAndGetFriendid() {
	        long testFriendid = 1;
	        friends.setFriendid(1);
	        assertEquals(testFriendid, friends.getFriendid());
	    }

	    public void testSetAndGetGranted() {  
	    boolean testGranted = true;
        friends.setGranted(true);
        assertEquals(testGranted, friends.getGranted());
        }
	    
	    public void testSetAndGetRank() {  
		    int testRank = 10;
	        friends.setRank(10);
	        assertEquals(testRank, friends.getRank());
	        }
	    
	    public void testSetAndGetReqreciver() {  
		    long testReqreceiver = 1;
	        friends.setReqreceiver(1);
	        assertEquals(testReqreceiver, friends.getReqreceiver());
	        }
	    
	    public void testSetAndGetReqsender() {  
		    long testReqsender = 2;
	        friends.setReqsender(2);
	        assertEquals(testReqsender, friends.getReqsender());
	        }
	  
}
