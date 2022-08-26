package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.dto.LeadData;
import com.marketing.entities.Lead;
import com.marketing.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
@RequestMapping("/create")
	public String ceateNewLeadPage() {
		
		
		return "create_lead";
	}
	
@RequestMapping("/save")
public String saveOneLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
	
	leadService.saveOneLead(lead);
	model.addAttribute("msg", "record is saved");
	return "create_lead";
}
@RequestMapping("/listall")
public String listAllLeads(ModelMap model) {
	
	List<Lead> leads = leadService.listLead();
	model.addAttribute("leads", leads);
	return "search_lead_result";
}
@RequestMapping("/delete")	
public String deleteOneLead(@RequestParam("id") long id,ModelMap model) {
	
	leadService.deleteOneLeadById(id);
	List<Lead> leads = leadService.listLead();
	model.addAttribute("leads", leads);
	return "search_lead_result";
}

@RequestMapping("/update")
public String updateOneLead(@RequestParam("id") long id, ModelMap model) {
	
	Lead lead = leadService.getOneLeadById(id);
	model.addAttribute("lead", lead);
	
	return "update_lead";
}
@RequestMapping("/updatelead")
public String updateOneLeadData(LeadData data,ModelMap model) {
	Lead lead = new Lead();
	
	lead.setId(data.getId());
	lead.setFirstName(data.getFirstName());
	lead.setLastName(data.getLastName());
	lead.setEmail(data.getEmail());
	lead.setMobile(data.getMobile());
	leadService.saveOneLead(lead);
	List<Lead> leads = leadService.listLead();
	model.addAttribute("leads", leads);
	return "search_lead_result";
}







}
