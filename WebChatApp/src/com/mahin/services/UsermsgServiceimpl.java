package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.UsermsgDAO;
import com.mahin.models.Usermsg;

@Service
@Transactional
public class UsermsgServiceimpl implements UsermsgService{

	@Autowired 
	 private UsermsgDAO usermsgDAO;
	 
	@Override
	public void addUsermsg(Usermsg usermsg) {
        usermsgDAO.addUsermsg(usermsg);
	}

	@Override
	public void updateUsermsg(Usermsg usermsg) {
		usermsgDAO.updateUsermsg(usermsg);		
	}

	@Override
	public Usermsg getUsermsg(long usermsgid) {
		return usermsgDAO.getUsermsg(usermsgid);
	}

	@Override
	public void deleteUsermsg(long usermsgid) {
		usermsgDAO.deleteUsermsg(usermsgid);	
	}

	@Override
	public List<Usermsg> getUsermsgs() {
        return usermsgDAO.getUsermsgs();
	}

}
