package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Usermsg;

@Repository
public class UsermsgDAOimpl implements UsermsgDAO{

	@Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	@Override
	public void addUsermsg(Usermsg usermsg) {
        getCurrentSession().save(usermsg);
		
	}

	@Override
	public void updateUsermsg(Usermsg usermsg) {
		Usermsg usermsgToUpdate = getUsermsg(usermsg.getUsermsgid());
		usermsgToUpdate.setReceiverid(usermsg.getReceiverid());
		usermsgToUpdate.setMessage(usermsg.getMessage());
		usermsgToUpdate.setSenderid(usermsg.getSenderid());
		usermsgToUpdate.setReadtime(usermsg.getReadtime());		
		 
	        getCurrentSession().update(usermsgToUpdate);		
	}

	@Override
	public Usermsg getUsermsg(long usermsgid) {
		Usermsg usermsg = (Usermsg) getCurrentSession().get(Usermsg.class, usermsgid);
        return usermsg;
	}

	@Override
	public void deleteUsermsg(long usermsgid) {
		Usermsg usermsg = getUsermsg(usermsgid);
        if (usermsg != null)
            getCurrentSession().delete(usermsg);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usermsg> getUsermsgs() {
        return getCurrentSession().createQuery("from usermsg").list();

	}

}
