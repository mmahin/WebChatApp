package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.GroupmsgDAO;
import com.mahin.models.Groupmsg;

@Service
@Transactional
public class GroupmsgServiceimpl implements GroupmsgService {

	@Autowired 
	 private GroupmsgDAO groupmsgDAO;
	 
	@Override
	public void addGroupmsg(Groupmsg groupmsg) {
		groupmsgDAO.addGroupmsg(groupmsg);
	}

	@Override
	public void updateGroupmsg(Groupmsg groupmsg) {
		groupmsgDAO.updateGroupmsg(groupmsg);
	}

	@Override
	public Groupmsg getGroupmsg(long groupmsgid) {
		return groupmsgDAO.getGroupmsg(groupmsgid);
	}

	@Override
	public void deleteGroupmsg(long groupmsgid) {
		groupmsgDAO.deleteGroupmsg(groupmsgid);
	}

	@Override
	public List<Groupmsg> getGroupmsgs() {
		return groupmsgDAO.getGroupmsgs();
	}

}
