package com.mahin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahin.daos.InstitutionsmemDAO;
import com.mahin.models.Institutionsmem;

@Service
@Transactional
public class InstitutionsmemServiceimpl implements InstitutionsmemService{

	@Autowired 
	 private InstitutionsmemDAO institutionsmemDAO;
	 
	@Override
	public void addInstitutionmem(Institutionsmem institutionsmem) {
		institutionsmemDAO.addInstitutionmem(institutionsmem);
	}

	@Override
	public void updateInstitutionmem(Institutionsmem institutionsmem) {
		institutionsmemDAO.updateInstitutionmem(institutionsmem);
	}

	@Override
	public Institutionsmem getInstitutionsmem(long institutionsmemid) {
		return institutionsmemDAO.getInstitutionsmem(institutionsmemid);
	}

	@Override
	public void deleteInstitutionmem(long institutionsmemid) {
		institutionsmemDAO.deleteInstitutionmem(institutionsmemid);		
	}

	@Override
	public List<Institutionsmem> getInstitutionsmems() {
        return institutionsmemDAO.getInstitutionsmems();
	}

}
