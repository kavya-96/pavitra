package com.cg.ems.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.ems.dao.IEmployeeDao;
import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;


public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDao empDao;

	@Override
	public Employee findEmployee(String EmployeeId) throws EMSException {
		
		return null;
	}
	
	

}
