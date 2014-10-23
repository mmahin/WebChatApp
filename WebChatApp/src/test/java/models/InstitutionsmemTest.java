package test.java.models;


import java.sql.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.mahin.models.Institutionsmem;

import junit.framework.TestCase;

public class InstitutionsmemTest extends TestCase {
	private  Institutionsmem institutionsmem;
    
    protected void setUp() throws Exception {
    	institutionsmem = new Institutionsmem();
	    }

		public void testSetAndGetInstitutionsid() {
	        long testInstitutionsid = 1;
	        institutionsmem.setInstitutionsid(1);
	        assertEquals(testInstitutionsid, institutionsmem.getInstitutionsid());
	    }

		public void testSetAndGetInstitutionsmemid() {
	        long testInstitutionsmemid = 1;
	        institutionsmem.setInstitutionsmemid(1);
	        assertEquals(testInstitutionsmemid, institutionsmem.getInstitutionsmemid());
	    }

		public void testSetAndGetUserid() {
	        long testUserid = 1;
	        institutionsmem.setUserid(1);
	        assertEquals(testUserid, institutionsmem.getUserid());
	    }

		public void testSetAndGetStartdate(){
			Date testDate = new Date(new DateTime(2007, 9, 23, 0, 0, 0, 0, DateTimeZone.forID( "America/Montreal" )).getMillis());
		        institutionsmem.setStartdate(testDate);
		        assertEquals(testDate, institutionsmem.getStartdate());
			
	
	    }
		

		public void testSetAndGetEnddate() {

			Date testDate = new Date(new DateTime(2007, 9, 23, 0, 0, 0, 0, DateTimeZone.forID( "America/Montreal" )).getMillis());

		        institutionsmem.setEnddate(testDate);
		        assertEquals(testDate, institutionsmem.getEnddate());
			
	
	    }	
	    
}
