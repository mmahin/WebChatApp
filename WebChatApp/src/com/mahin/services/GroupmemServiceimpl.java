package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.GroupmemDAO;
import com.mahin.models.Groupmem;

@Service
@Transactional
public class GroupmemServiceimpl implements GroupmemService {

	@Autowired 
	 private GroupmemDAO groupmemDAO;
	
	@Override
	public void addGroupmem(Groupmem groupmem) {
		groupmemDAO.addGroupmem(groupmem);
	}

	@Override
	public void updateGroupmem(Groupmem groupmem) {
		groupmemDAO.updateGroupmem(groupmem);
	}

	@Override
	public Groupmem getGroupmem(long groupmemid) {
		return groupmemDAO.getGroupmem(groupmemid);
	}

	@Override
	public void deleteGroupmem(long groupmemid) {
		groupmemDAO.deleteGroupmem(groupmemid);
	}
	
	@Override
	public List<Groupmem> getGroupmem() {
        return groupmemDAO.getGroupmem();
	}

}
