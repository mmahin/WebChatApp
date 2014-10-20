package com.mahin.daos;

import java.util.List;

import com.mahin.models.Institutionsmem;;

public interface InstitutionsmemDAO {

	public void addInstitutionmem(Institutionsmem institutionsmem);
    public void updateInstitutionmem(Institutionsmem institutionsmem);
    public Institutionsmem getInstitutionsmem(long institutionsmemid);
    public void deleteInstitutionmem(long institutionsmemid);
    public List<Institutionsmem> getInstitutionsmems();
}
