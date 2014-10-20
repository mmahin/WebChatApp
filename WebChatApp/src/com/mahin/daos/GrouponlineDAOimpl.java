package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Grouponline;

@Repository
public class GrouponlineDAOimpl implements GrouponlineDAO{

	 @Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	@Override
	public void addGrouponline(Grouponline grouponline) {
        getCurrentSession().save(grouponline);
		
	}

	@Override
	public void updateGrouponline(Grouponline grouponline) {
		Grouponline grouponlineToUpdate = getGrouponline(grouponline.getGrouponlineid());
		grouponlineToUpdate.setGroupsid(grouponline.getGroupsid());
		grouponlineToUpdate.setUserid(grouponline.getUserid());		
		
        getCurrentSession().update(grouponlineToUpdate);

	}

	@Override
	public Grouponline getGrouponline(long grouponlineid) {
		Grouponline grouponline = (Grouponline) getCurrentSession().get(Grouponline.class, grouponlineid);
        return grouponline;
	}

	@Override
	public void deleteGrouponline(long grouponlineid) {
		Grouponline grouponline = getGrouponline(grouponlineid);
        if (grouponline != null)
            getCurrentSession().delete(grouponline);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Grouponline> getGrouponline() {
        return getCurrentSession().createQuery("from grouponline").list();

	}

}
