package com.mahin.daos;

import java.util.List;

import com.mahin.models.Usermsg;

public interface UsermsgDAO {

	public void addUsermsg(Usermsg usermsg);
    public void updateUsermsg(Usermsg usermsg);
    public Usermsg getUsermsg(long usermsgid);
    public void deleteUsermsg(long usermsgid);
    public List<Usermsg> getUsermsgs();
}
