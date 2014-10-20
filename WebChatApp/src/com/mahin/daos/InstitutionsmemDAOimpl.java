package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Institutionsmem;

@Repository
public class InstitutionsmemDAOimpl implements InstitutionsmemDAO{

	@Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	@Override
	public void addInstitutionmem(Institutionsmem institutionsmem) {
        getCurrentSession().save(institutionsmem);
		
	}

	@Override
	public void updateInstitutionmem(Institutionsmem institutionsmem) {

		Institutionsmem institutionmemToUpdate = getInstitutionsmem(institutionsmem.getInstitutionsmemid());
		institutionmemToUpdate.setInstitutionsid(institutionsmem.getInstitutionsid());
		institutionmemToUpdate.setStartdate(institutionsmem.getStartdate());
		institutionmemToUpdate.setEnddate(institutionsmem.getEnddate());
		institutionmemToUpdate.setUserid(institutionsmem.getUserid());
	       
	        getCurrentSession().update(institutionmemToUpdate);		
	}

	@Override
	public Institutionsmem getInstitutionsmem(long institutionsmemid) {
		Institutionsmem institutionsmem = (Institutionsmem) getCurrentSession().get(Institutionsmem.class, institutionsmemid);
        return institutionsmem;
	}

	@Override
	public void deleteInstitutionmem(long institutionsmemid) {
		
		Institutionsmem institutionsmem = getInstitutionsmem(institutionsmemid);
        if (institutionsmem != null)
            getCurrentSession().delete(institutionsmem);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Institutionsmem> getInstitutionsmems() {
        return getCurrentSession().createQuery("from institutionsmem").list();

	}

}
