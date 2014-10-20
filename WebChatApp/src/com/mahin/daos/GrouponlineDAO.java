package com.mahin.daos;

import java.util.List;

import com.mahin.models.Grouponline;;

public interface GrouponlineDAO {

	public void addGrouponline(Grouponline grouponline);
    public void updateGrouponline(Grouponline grouponline);
    public Grouponline getGrouponline(long grouponlineid);
    public void deleteGrouponline(long grouponlineid);
    public List<Grouponline> getGrouponline();
}
