package com.mahin.services;

import java.util.List;

import com.mahin.models.Friends;

public interface FriendsService {

	public void addFriend(Friends friend);
    public void updateFriend(Friends friend);
    public Friends getFriend(long friendid);
    public void deleteFriend(long friendid);
    public List<Friends> getFriends();
}
