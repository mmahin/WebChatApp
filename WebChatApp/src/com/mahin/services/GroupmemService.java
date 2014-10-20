package com.mahin.services;

import java.util.List;

import com.mahin.models.Groupmem;

public interface GroupmemService {

	public void addGroupmem(Groupmem groupmem);
    public void updateGroupmem(Groupmem groupmem);
    public Groupmem getGroupmem(long groupmemid);
    public void deleteGroupmem(long groupmemid);
    public List<Groupmem> getGroupmem();
}
