package com.blackcoffer.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.blackcoffer.model.Company;

public interface CompanyService {
	public List<Company> getData();
	public List<Object> getByRegion();
	public List<Object> getDataByCountry();
	public List<Object> findDashboardDetailsByEndYear(@Param("endYear") String endYear);

}
