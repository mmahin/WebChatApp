package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.NotificationsDAO;
import com.mahin.models.Notifications;

@Service
@Transactional
public class NotificationsServiceimpl implements NotificationsService{

	 @Autowired 
	 private NotificationsDAO notificationsDAO;

	@Override
	public void addNotification(Notifications notification) {
		notificationsDAO.addNotification(notification);
	}

	@Override
	public void updateNotification(Notifications notification) {
		notificationsDAO.updateNotification(notification);
	}

	@Override
	public Notifications getNotification(long notificationsid) {
		return notificationsDAO.getNotification(notificationsid);
	}

	@Override
	public void deleteNotification(long notificationsid) {
	     notificationsDAO.deleteNotification(notificationsid);
	}

	@Override
	public List<Notifications> getNotifications() {
        return notificationsDAO.getNotifications();
	}

}
