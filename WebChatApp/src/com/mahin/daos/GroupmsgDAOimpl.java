package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Groupmsg;

@Repository
public class GroupmsgDAOimpl implements GroupmsgDAO {

	@Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	@Override
	public void addGroupmsg(Groupmsg groupmsg) {
        getCurrentSession().save(groupmsg);
		
	}

	@Override
	public void updateGroupmsg(Groupmsg groupmsg) {
		 Groupmsg groupmsgToUpdate = getGroupmsg(groupmsg.getGroupmsgid());
		 groupmsgToUpdate.setGroupsid(groupmsg.getGroupsid());
		 groupmsgToUpdate.setMessage(groupmsg.getMessage());
		 groupmsgToUpdate.setSendtime(groupmsg.getSendtime());
		 groupmsgToUpdate.setUserid(groupmsg.getUserid());		
		 
	        getCurrentSession().update(groupmsgToUpdate);

	}

	@Override
	public Groupmsg getGroupmsg(long groupmsgid) {
		Groupmsg groupmsg = (Groupmsg) getCurrentSession().get(Groupmsg.class, groupmsgid);
	        return groupmsg;
	}

	@Override
	public void deleteGroupmsg(long groupmsgid) {

		Groupmsg groupmsg = getGroupmsg(groupmsgid);
        if (groupmsg != null)
            getCurrentSession().delete(groupmsg);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Groupmsg> getGroupmsgs() {
        return getCurrentSession().createQuery("from groupmsg").list();

	}

}
