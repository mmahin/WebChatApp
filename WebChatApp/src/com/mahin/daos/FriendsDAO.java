package com.mahin.daos;

import java.util.List;

import com.mahin.models.Friends;

public interface FriendsDAO {

	public void addFriend(Friends friend);
    public void updateFriend(Friends friend);
    public Friends getFriend(long friendid);
    public void deleteFriend(long friendid);
    public List<Friends> getFriends();
}
