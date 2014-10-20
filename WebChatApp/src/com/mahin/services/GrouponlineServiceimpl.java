package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.GrouponlineDAO;
import com.mahin.models.Grouponline;

@Service
@Transactional
public class GrouponlineServiceimpl implements GrouponlineService{

	 @Autowired 
	 private GrouponlineDAO grouponlineDAO;
	 
	@Override
	public void addGrouponline(Grouponline grouponline) {
		grouponlineDAO.addGrouponline(grouponline);
	}

	@Override
	public void updateGrouponline(Grouponline grouponline) {
		grouponlineDAO.updateGrouponline(grouponline);
	}

	@Override
	public Grouponline getGrouponline(long grouponlineid) {
		return grouponlineDAO.getGrouponline(grouponlineid);
	}

	@Override
	public void deleteGrouponline(long grouponlineid) {
		grouponlineDAO.deleteGrouponline(grouponlineid);	
	}

	@Override
	public List<Grouponline> getGrouponline() {
		return grouponlineDAO.getGrouponline();
	}

}
