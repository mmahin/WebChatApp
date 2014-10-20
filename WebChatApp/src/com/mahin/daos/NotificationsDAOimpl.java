package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Notifications;

@Repository
public class NotificationsDAOimpl implements NotificationsDAO{

	 @Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	@Override
	public void addNotification(Notifications notification) {
        getCurrentSession().save(notification);
		
	}

	@Override
	public void updateNotification(Notifications notification) {
		
		Notifications notificationToUpdate = getNotification(notification.getNotificationsid());
		notificationToUpdate.setGroupsid(notification.getGroupsid());
		notificationToUpdate.setReceiverid(notification.getReceiverid());
		notificationToUpdate.setSenderid(notification.getSenderid());
		notificationToUpdate.setDate(notification.getDate());
		notificationToUpdate.setType(notification.getType());

	        getCurrentSession().update(notificationToUpdate);		
	}

	@Override
	public Notifications getNotification(long notificationsid) {
		Notifications notification = (Notifications) getCurrentSession().get(Notifications.class, notificationsid);
        return notification;
	}

	@Override
	public void deleteNotification(long notificationsid) {
		
		Notifications notification = getNotification(notificationsid);
        if (notification != null)
            getCurrentSession().delete(notification);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Notifications> getNotifications() {
        return getCurrentSession().createQuery("from notifications").list();

	}

}
