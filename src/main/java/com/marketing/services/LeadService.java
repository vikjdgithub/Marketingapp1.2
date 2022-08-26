package com.marketing.services;

import java.util.List;

import com.marketing.entities.Lead;

public interface LeadService {

	
	public void saveOneLead(Lead lead);
	
	public void deleteOneLeadById(long id);
	
	public List<Lead> listLead();
	
	public Lead getOneLeadById(long id);
	
	
}
