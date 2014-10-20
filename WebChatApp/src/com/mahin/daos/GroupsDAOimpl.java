package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Groups;

@Repository
public class GroupsDAOimpl implements GroupsDAO{

	@Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	@Override
	public void addGroup(Groups group) {

        getCurrentSession().save(group);
	}

	@Override
	public void updateGroup(Groups group) {

		Groups groupToUpdate = getGroup(group.getGroupsid());
		groupToUpdate.setGroupsname(group.getGroupsname());
		groupToUpdate.setDescription(group.getDescription());
		
        getCurrentSession().update(groupToUpdate);

	}

	@Override
	public Groups getGroup(long groupsid) {
		Groups group = (Groups) getCurrentSession().get(Groups.class, groupsid);
	        return group;
	}

	@Override
	public void deleteGroup(long groupsid) {
		
		Groups group = getGroup(groupsid);
        if (group != null)
            getCurrentSession().delete(group);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Groups> getGroups() {
        return getCurrentSession().createQuery("from groups").list();

	}

}
