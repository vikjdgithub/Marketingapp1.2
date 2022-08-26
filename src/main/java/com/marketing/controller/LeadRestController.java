package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	private LeadService leadService;
	
	@GetMapping
	public List<Lead> getAllLeads(){
		
		List<Lead> leads = leadService.listLead();
		
		
		return leads;
	}
	@PostMapping
	public void saveOneLead(@RequestBody Lead lead) {
		
		leadService.saveOneLead(lead);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable long id) {
		
		leadService.deleteOneLeadById(id);
		
	}
	
	@PutMapping
	public void updateOneLead(@RequestBody Lead lead) {
		
		leadService.saveOneLead(lead);
	}
	
}
