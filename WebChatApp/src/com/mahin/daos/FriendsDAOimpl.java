package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Friends;

@Repository
public class FriendsDAOimpl implements FriendsDAO{
	
	@Autowired 
	 private SessionFactory sessionFactory;
	
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }

	@Override
	public void addFriend(Friends friend) {		
        getCurrentSession().save(friend);

	}

	@Override
	public void updateFriend(Friends friend) {
		
		 Friends friendToUpdate = getFriend(friend.getFriendid());
		 friendToUpdate.setGranted(friend.getGranted());
		 friendToUpdate.setRank(friend.getRank());
		 friendToUpdate.setReqreceiver(friend.getReqreceiver());
		 friendToUpdate.setReqsender(friend.getReqsender());
		 
	        getCurrentSession().update(friendToUpdate);

	}

	@Override
	public Friends getFriend(long friendid) {
		
		Friends friend = (Friends) getCurrentSession().get(Friends.class, friendid);
        return friend;
	}

	@Override
	public void deleteFriend(long friendid) {

		Friends friend = getFriend(friendid);
        if (friend != null)
            getCurrentSession().delete(friend);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Friends> getFriends() {
 
		return getCurrentSession().createQuery("from friends").list();
	}

}
