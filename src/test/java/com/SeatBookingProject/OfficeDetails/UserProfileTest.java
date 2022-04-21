package com.SeatBookingProject.OfficeDetails;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import com.dao.UserProfileService;
import com.model.UserProfileDetails;

import junit.framework.Assert;
@SpringBootTest
class UserProfileTest {
  @Autowired
  UserProfileService service;
	@Test
	void testAdd() {
		UserProfileDetails profile=new UserProfileDetails();
		profile.setUserName("Ranjitha");
		profile.setUseremailId("Ranjitha1997@gmail.com");
		profile.setAddress("Peenya 1 stage");
		profile.setAge(25);
		profile.setDob("10/08/1997");
		profile.setMobile("9980763490");	
		service.add(profile);
		
		UserProfileDetails profile1=service.find(profile.getUseremailId());
			Assert.assertEquals("Ranjitha", profile1.getUserName());
		Assert.assertEquals("Ranjitha1997@gmail.com", profile1.getUseremailId());
		Assert.assertEquals("Peenya 1 stage", profile1.getAddress());
		Assert.assertEquals(25, profile1.getAge());
		Assert.assertEquals("10/08/1997", profile1.getDob());
		Assert.assertEquals("9980763490", profile1.getMobile());
		
		
	}
	
			
	@Test
	void testFind() {
		UserProfileDetails profile4=new UserProfileDetails();
		profile4.setUseremailId("hhhf@gmail.com");
		try
		{
			service.add(profile4);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		UserProfileDetails profile8=service.find(profile4.getUseremailId());
		Assert.assertNull(profile8);
	}

	@Test
	void testFindAll() {
		UserProfileDetails profile5=new UserProfileDetails();
		profile5.setUserName("vinodh");
		profile5.setAddress("Laggere jjhh");
		profile5.setAge(24);
		profile5.setDob("10/08/1997");
		profile5.setMobile("9987628990")	;
		profile5.setUseremailId("Ranjitha@gmail.com");
		service.add(profile5);
		
		List<UserProfileDetails> profilelist=service.findAll();
		Assert.assertEquals(profilelist.get(0).getUserName(),"Ranjitha");
		Assert.assertEquals(profilelist.get(1).getUserName(), "vinodh");
	}
    @Test
	void testUpdate() {
	UserProfileDetails uc=new UserProfileDetails();
	uc.setUserName("Lakshmi");
	uc.setUseremailId("Lakshmi@gmail.com");
	uc.setAddress("chennai jjdjjd");
	uc.setAge(30);
	uc.setDob("07/08/2000");
	uc.setMobile("9087543790");
	service.add(uc);
	uc.setUserName("vinodh");
	Assert.assertEquals(true, service.update(uc));
			
	}

	@Test
	void testDelete() {
		service.delete("Ranjitha1997@gmail.com");
		UserProfileDetails profile=service.find("Ranjitha1997@gmail.com");
		Assert.assertNull(profile);
		
		
		
		
	}

}
