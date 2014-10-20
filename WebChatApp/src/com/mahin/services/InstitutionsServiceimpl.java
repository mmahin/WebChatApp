package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.InstitutionsDAO;
import com.mahin.models.Institutions;

@Service
@Transactional
public class InstitutionsServiceimpl implements InstitutionsService{

	@Autowired 
	 private InstitutionsDAO institutionsDAO;
	 
	@Override
	public void addInstitution(Institutions institution) {
        institutionsDAO.addInstitution(institution);
	}

	@Override
	public void updateInstitution(Institutions institution) {
		institutionsDAO.updateInstitution(institution);		
	}

	@Override
	public Institutions getInstitution(long institutionsid) {
		return institutionsDAO.getInstitution(institutionsid);
	}

	@Override
	public void deleteInstitution(long institutionsid) {
		institutionsDAO.deleteInstitution(institutionsid);
	}

	@Override
	public List<Institutions> getInstitutions() {
        return institutionsDAO.getInstitutions();
	}

}
