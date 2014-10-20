package com.mahin.services;

import java.util.List;

import com.mahin.models.Users;

public interface UsersService {

	public void addUser(Users user);
    public void updateUser(Users user);
    public Users getUser(long userid);
    public void deleteUser(long userid);
    public List<Users> getUsers();
    
}
