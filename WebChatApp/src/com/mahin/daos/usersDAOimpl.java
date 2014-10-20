package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Users;

@Repository
public class UsersDAOimpl implements UsersDAO{

	 @Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }

	@Override
	public void addUser(Users user) {
        getCurrentSession().save(user);
	}

	@Override
	public void updateUser(Users user) {

		 Users userToUpdate = getUser(user.getUserid());
	       userToUpdate.setUsername(user.getUsername());
	       userToUpdate.setAbout(user.getAbout());
	       userToUpdate.setBirthday(user.getBirthday());
	       userToUpdate.setCity(user.getCity());
	       userToUpdate.setCountry(user.getCountry());
	       userToUpdate.setEmail(user.getEmail());
	       userToUpdate.setFname(user.getFname());
	       userToUpdate.setGender(user.getGender());
	       userToUpdate.setImage(user.getImage());
	       userToUpdate.setLname(user.getLname());
	       userToUpdate.setOnline(user.getOnline());
	       userToUpdate.setPassword(user.getPassword());
	       userToUpdate.setPriority(user.getPriority());

	        getCurrentSession().update(userToUpdate);
	}

	@Override
	public Users getUser(long userid) {

		 Users user = (Users) getCurrentSession().get(Users.class, userid);
	        return user;
	}

	@Override
	public void deleteUser(long userid) {

		Users user = getUser(userid);
        if (user != null)
            getCurrentSession().delete(user);
    }
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getUsers() {

        return getCurrentSession().createQuery("from users").list();
	}
	   
	  
}
