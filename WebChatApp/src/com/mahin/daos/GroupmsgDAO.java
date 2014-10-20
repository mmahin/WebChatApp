package com.mahin.daos;

import java.util.List;

import com.mahin.models.Groupmsg;

public interface GroupmsgDAO {

	public void addGroupmsg(Groupmsg groupmsg);
    public void updateGroupmsg(Groupmsg groupmsg);
    public Groupmsg getGroupmsg(long groupmsgid);
    public void deleteGroupmsg(long groupmsgid);
    public List<Groupmsg> getGroupmsgs();
}
