package com.mahin.daos;

import java.util.List;

import com.mahin.models.Notifications;

public interface NotificationsDAO {

	public void addNotification(Notifications notification);
    public void updateNotification(Notifications notification);
    public Notifications getNotification(long notificationsid);
    public void deleteNotification(long notificationsid);
    public List<Notifications> getNotifications();
}
