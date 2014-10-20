package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.UsersDAO;
import com.mahin.models.Users;

@Service
@Transactional
public class UsersServiceimpl implements UsersService{

	 @Autowired 
	 private UsersDAO usersDAO;

	@Override
	public void addUser(Users user) {
        usersDAO.addUser(user);
	}

	@Override
	public void updateUser(Users user) {
		usersDAO.updateUser(user);
	}

	@Override
	public Users getUser(long userid) {
		return usersDAO.getUser(userid);
	}

	@Override
	public void deleteUser(long userid) {
		usersDAO.deleteUser(userid);
    }
	
	@Override
	public List<Users> getUsers() {
        return usersDAO.getUsers();
	}
	   
	  
}
