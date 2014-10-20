package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Groupmem;

@Repository
public class GroupmemDAOimpl implements GroupmemDAO {

	@Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	@Override
	public void addGroupmem(Groupmem groupmem) {
        getCurrentSession().save(groupmem);
		
	}

	@Override
	public void updateGroupmem(Groupmem groupmem) {
		 Groupmem groupmemToUpdate = getGroupmem(groupmem.getGroupmemid());
		 groupmemToUpdate.setGroupsid(groupmem.getGroupsid());
		 groupmemToUpdate.setIsmember(groupmem.getIsmember());
		 groupmemToUpdate.setRole(groupmem.getRole());
		 groupmemToUpdate.setUserid(groupmem.getUserid());		
		 
	        getCurrentSession().update(groupmemToUpdate);

	}

	@Override
	public Groupmem getGroupmem(long groupmemid) {
		Groupmem groupmem = (Groupmem) getCurrentSession().get(Groupmem.class, groupmemid);
	        return groupmem;
	}

	@Override
	public void deleteGroupmem(long groupmemid) {

		Groupmem groupmem = getGroupmem(groupmemid);
        if (groupmem != null)
            getCurrentSession().delete(groupmem);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Groupmem> getGroupmem() {
        return getCurrentSession().createQuery("from groupmem").list();

	}

}
