package com.mahin.daos;

import java.util.List;

import com.mahin.models.Institutions;;

public interface InstitutionsDAO {

	public void addInstitution(Institutions institution);
    public void updateInstitution(Institutions institution);
    public Institutions getInstitution(long institutionsid);
    public void deleteInstitution(long institutionsid);
    public List<Institutions> getInstitutions();
}
