package test.java.models;


import com.mahin.models.Institutions;

import junit.framework.TestCase;

public class InstitutionsTest extends TestCase {

	 private  Institutions institutions;
     
     protected void setUp() throws Exception {
     	institutions = new Institutions();
	    }

		public void testSetAndGetInstitutionsid() {
	        long testInstitutionsid = 1;
	        institutions.setInstitutionsid(1);
	        assertEquals(testInstitutionsid, institutions.getInstitutionsid());
	    }

	    
	    public void testSetAndGetCity() {  
		    String testCity = "hi";
		    institutions.setCity("hi");
	        assertEquals(testCity, institutions.getCity());
	        }
	    
	    public void testSetAndGetCountry() {  
		    String testCountry = "hi";
		    institutions.setCountry("hi");
	        assertEquals(testCountry, institutions.getCountry());
	        }
	    
	    public void testSetAndGetName() {  
		    String testName = "hi";
		    institutions.setName("hi");
	        assertEquals(testName, institutions.getName());
	        }
	    

}
