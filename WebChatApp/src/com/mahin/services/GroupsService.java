package com.mahin.services;

import java.util.List;

import com.mahin.models.Groups;

public interface GroupsService {

	public void addGroup(Groups group);
    public void updateGroup(Groups group);
    public Groups getGroup(long groupsid);
    public void deleteGroup(long groupsid);
    public List<Groups> getGroups();
}
