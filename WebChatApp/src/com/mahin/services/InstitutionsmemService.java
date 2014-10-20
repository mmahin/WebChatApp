package com.mahin.services;

import java.util.List;

import com.mahin.models.Institutionsmem;;

public interface InstitutionsmemService {

	public void addInstitutionmem(Institutionsmem institutionsmem);
    public void updateInstitutionmem(Institutionsmem institutionsmem);
    public Institutionsmem getInstitutionsmem(long institutionsmemid);
    public void deleteInstitutionmem(long institutionsmemid);
    public List<Institutionsmem> getInstitutionsmems();
}
