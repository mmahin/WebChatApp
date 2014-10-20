package com.mahin.services;

import java.util.List;

import com.mahin.models.Grouponline;;

public interface GrouponlineService {

	public void addGrouponline(Grouponline grouponline);
    public void updateGrouponline(Grouponline grouponline);
    public Grouponline getGrouponline(long grouponlineid);
    public void deleteGrouponline(long grouponlineid);
    public List<Grouponline> getGrouponline();
}
