package com.mahin.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.FriendsDAO;
import com.mahin.models.Friends;

@Service
@Transactional
public class FriendsServiceimpl implements FriendsService{
	
	@Autowired 
	 private FriendsDAO friendsDAO;
	
	@Override
	public void addFriend(Friends friend) {		
        friendsDAO.addFriend(friend);
	}

	@Override
	public void updateFriend(Friends friend) {
		friendsDAO.updateFriend(friend);
	}

	@Override
	public Friends getFriend(long friendid) {
		return friendsDAO.getFriend(friendid);
	}

	@Override
	public void deleteFriend(long friendid) {
		friendsDAO.deleteFriend(friendid);
	}
	@Override
	public List<Friends> getFriends() {
		return friendsDAO.getFriends();
		}

}
