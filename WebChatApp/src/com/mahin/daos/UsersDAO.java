package com.mahin.daos;

import java.util.List;

import com.mahin.models.Users;

public interface UsersDAO {

	public void addUser(Users user);
    public void updateUser(Users user);
    public Users getUser(long userid);
    public void deleteUser(long userid);
    public List<Users> getUsers();
    
}
