package com.mahin.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahin.models.Institutions;

@Repository
public class InstitutionsDAOimpl implements InstitutionsDAO{

	@Autowired 
	 private SessionFactory sessionFactory;
	  
	 private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 
	@Override
	public void addInstitution(Institutions institution) {
        getCurrentSession().save(institution);
		
	}

	@Override
	public void updateInstitution(Institutions institution) {
		Institutions institutionToUpdate = getInstitution(institution.getInstitutionsid());
		institutionToUpdate.setName(institution.getName());
		institutionToUpdate.setCity(institution.getCountry());
		institutionToUpdate.setCountry(institution.getCountry());
	    
	        getCurrentSession().update(institutionToUpdate);		
	}

	@Override
	public Institutions getInstitution(long institutionsid) {
		Institutions institution = (Institutions) getCurrentSession().get(Institutions.class, institutionsid);
        return institution;
	}

	@Override
	public void deleteInstitution(long institutionsid) {
		Institutions institution = getInstitution(institutionsid);
        if (institution != null)
            getCurrentSession().delete(institution);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Institutions> getInstitutions() {
        return getCurrentSession().createQuery("from institutions").list();

	}

}
