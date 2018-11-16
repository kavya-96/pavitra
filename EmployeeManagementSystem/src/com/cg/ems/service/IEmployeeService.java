package com.cg.ems.service;

import com.cg.ems.exception.EMSException;
import com.cg.ems.model.Employee;

public interface IEmployeeService {
	
	Employee findEmployee(String EmployeeId) throws EMSException;
	
	
}
