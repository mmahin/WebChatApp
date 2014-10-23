package test.java.models;

import junit.framework.TestCase;

import com.mahin.models.Groupmem;

public class GroupmemTest extends TestCase{
    private Groupmem groupmem;

    protected void setUp() throws Exception {
    	groupmem = new Groupmem();
    }

	public void testSetAndGetGroupmemid() {
        long testGroupmemid = 1;
        groupmem.setGroupmemid(1);
        assertEquals(testGroupmemid, groupmem.getGroupmemid());
    }

    public void testSetAndGetGroupsid() {  
    long testGroupsid = 1;
    groupmem.setGroupsid(1);
    assertEquals(testGroupsid, groupmem.getGroupsid());
    }
    
    public void testSetAndGetIsmember() {  
	    boolean testIsmember = true;
        groupmem.setIsmember(true);
        assertEquals(testIsmember, groupmem.getIsmember());
        }
    
    public void testSetAndGetRole() {  
	    String testRole = "Admin";
        groupmem.setRole("Admin");
        assertEquals(testRole, groupmem.getRole());
        }
    
    public void testSetAndGetUserid() {  
	    long testUserid = 2;
        groupmem.setUserid(2);
        assertEquals(testUserid, groupmem.getUserid());
        }
}
