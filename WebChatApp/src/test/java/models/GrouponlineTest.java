package test.java.models;

import junit.framework.TestCase;

import com.mahin.models.Grouponline;

public class GrouponlineTest extends TestCase{

	private Grouponline grouponline;
	 protected void setUp() throws Exception {
     	grouponline = new Grouponline();
	    }

		public void testSetAndGetGrouponlineid() {
	        long testGrouponlineid = 1;
	        grouponline.setGrouponlineid(1);
	        assertEquals(testGrouponlineid, grouponline.getGrouponlineid());
	    }

	    public void testSetAndGetGroupsid() {  
	    long testGroupsid = 1;
	    grouponline.setGroupsid(1);
     assertEquals(testGroupsid, grouponline.getGroupsid());
     }
	    
	    public void testSetAndGetUserid() {  
		    long testUserid = 1;
		    grouponline.setUserid(1);
	        assertEquals(testUserid, grouponline.getUserid());
	        }
}
