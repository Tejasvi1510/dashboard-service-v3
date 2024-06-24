package com.blackcoffer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.model.Company;
import com.blackcoffer.service.CompanyServiceImpl;

@RestController
@CrossOrigin("*")
public class CompnyController {
    
	@Autowired
	CompanyServiceImpl cServiceImpl;
	
	
	 @GetMapping("/getData")
	 public List<Company> getData()
	 {
		 return cServiceImpl.getData();
	 }
	
	@GetMapping("/saveFile")
	public void saveFile()
	{
		 cServiceImpl.saveFileV2();
	}
      
	@GetMapping("/getByRegion")
	public List<Object> getByRegion()
	{
		return cServiceImpl.getByRegion();
	}
	//get countrywise data
	@GetMapping("/getDataByCountry")
	public List<Object> getDataByCountry()
	{
		return cServiceImpl.getDataByCountry();
	}
	
	
	//filter data yearwise
	@GetMapping("/filterByYear/{year}")
	public List<Object> filterByYear(@PathVariable String year)
	{
		return cServiceImpl.findDashboardDetailsByEndYear(year);
	}
	
	@GetMapping("/getDataBy/{filterName}/{filterValue}")
    public List<Object> getDataBy(@PathVariable String filterName, @PathVariable String filterValue) {
        return cServiceImpl.getDataBy(filterName, filterValue);
    }
	
	
}
