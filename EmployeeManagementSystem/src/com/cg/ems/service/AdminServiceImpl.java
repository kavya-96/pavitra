package com.cg.ems.service;

import com.cg.ems.dao.AdminDaoImpl;
import com.cg.ems.dao.IAdminDao;

public class AdminServiceImpl implements IAdminService{
	
	IAdminDao dao=new AdminDaoImpl();

}
