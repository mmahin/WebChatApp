package test.java.models;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.sql.Date;

import javax.imageio.ImageIO;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.mahin.models.Users;

import junit.framework.TestCase;

public class UsersTest extends TestCase{
 
	private Users users;
	
	protected void setUp() throws Exception {
		users = new Users();
	    }
	 public void testSetAndGetAbout() {  
		    String testAbout = "hi";
		    users.setAbout("hi");
	        assertEquals(testAbout, users.getAbout());
	        }
	 public void testSetAndGetBirthday(){
			Date testBirthday = new Date(new DateTime(2007, 9, 23, 0, 0, 0, 0, DateTimeZone.forID( "America/Montreal" )).getMillis());
		        users.setBirthday(testBirthday);
		        assertEquals(testBirthday, users.getBirthday());
	 }
	 public void testSetAndGetCity() {  
		    String testCity = "hi";
		    users.setCity("hi");
	        assertEquals(testCity, users.getCity());
	        }
	    
	    public void testSetAndGetCountry() {  
		    String testCountry = "hi";
		    users.setCountry("hi");
	        assertEquals(testCountry, users.getCountry());
	        }
	    public void testSetAndGetEmail() {  
		    String testEmail = "hi";
		    users.setEmail("hi");
	        assertEquals(testEmail, users.getEmail());
	        }
	    
	    public void testSetAndGetFname() {  
		    String testFname = "hi";
		    users.setFname("hi");
	        assertEquals(testFname, users.getFname());
	        }
	    public void testSetAndGetGender() {  
		    String testGender = "hi";
		    users.setGender("hi");
	        assertEquals(testGender, users.getGender());
	        }
	    public void testSetAndGetImage() throws IOException {  
	    	BufferedImage img;
	        img = ImageIO.read(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
	        WritableRaster raster = img .getRaster();
	        DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
		    byte[] testImage = data.getData();
		    users.setImage(testImage);
	        assertEquals(testImage, users.getImage());
	        }
	    public void testSetAndGetLname() {  
		    String testLname = "hi";
		    users.setLname("hi");
	        assertEquals(testLname, users.getLname());
	        }
	    public void testSetAndGetOnline() {  
		    boolean testOnline = true;
	        users.setOnline(true);
	        assertEquals(testOnline, users.getOnline());
	        }
	    public void testSetAndGetPassword() {  
		    String testPassword = "hi";
		    users.setPassword("hi");
	        assertEquals(testPassword, users.getPassword());
	        }
	    public void testSetAndGetPriority() {  
		    int testPriority = 5;
		    users.setPriority(5);
	        assertEquals(testPriority, users.getPriority());
	        }
	    public void testSetAndGetUserid() {  
		    long testUserid = 5;
		    users.setUserid(5);
	        assertEquals(testUserid, users.getUserid());
	        }
	    public void testSetAndGetUsername() {  
		    String testUsername = "mahin";
		    users.setUsername("mahin");
	        assertEquals(testUsername, users.getUsername());
	        }
}
