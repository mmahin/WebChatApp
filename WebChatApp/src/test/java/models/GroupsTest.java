package test.java.models;


import com.mahin.models.Groups;

import junit.framework.TestCase;


public class GroupsTest extends TestCase{
	  private  Groups groups;
      
      protected void setUp() throws Exception {
      	groups = new Groups();
	    }


	    public void testSetAndGetGroupsid() {  
	    long testGroupsid = 1;
	    groups.setGroupsid(1);
      assertEquals(testGroupsid, groups.getGroupsid());
      }
	    
	    public void testSetAndGetGroupsname() {  
		    String testGroupsname = "hi";
		    groups.setGroupsname("hi");
	        assertEquals(testGroupsname, groups.getGroupsname());
	        }
	    public void testSetAndGetDescription() {  
		    String testDescription = "hi";
		    groups.setDescription("hi");
	        assertEquals(testDescription, groups.getDescription());
	        }
	    
	    
}
