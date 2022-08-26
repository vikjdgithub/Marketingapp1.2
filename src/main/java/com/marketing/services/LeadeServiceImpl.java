package com.marketing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Lead;
import com.marketing.repository.LeadRepository;
@Service
public class LeadeServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {

		leadRepo.save(lead);
		
	}

	@Override
	public void deleteOneLeadById(long id) {

		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listLead() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getOneLeadById(long id) {
Optional<Lead> findById = leadRepo.findById(id);
Lead lead = findById.get();
		return lead;
	}

}
