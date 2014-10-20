package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.GroupsDAO;
import com.mahin.models.Groups;

@Service
@Transactional
public class GroupsSrviceimpl implements GroupsService{

	@Autowired 
	 private GroupsDAO groupsDAO;
	 
	@Override
	public void addGroup(Groups group) {
		groupsDAO.addGroup(group);
	}

	@Override
	public void updateGroup(Groups group) {
		groupsDAO.updateGroup(group);
	}

	@Override
	public Groups getGroup(long groupsid) {
		return groupsDAO.getGroup(groupsid);
	}

	@Override
	public void deleteGroup(long groupsid) {
		groupsDAO.deleteGroup(groupsid);
	}

	@Override
	public List<Groups> getGroups() {
		return groupsDAO.getGroups();
	}

}
