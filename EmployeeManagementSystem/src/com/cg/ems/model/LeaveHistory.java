package com.cg.ems.model;

import java.util.Date;

public class LeaveHistory {

	private int LeaveId;
	private int LeaveBalance;
	private int noofdays;
	private Date dateFrom;
	private Date dateTo;
	private String status;
	private Employee EmpId;

	public LeaveHistory() {

	}

	public LeaveHistory(int leaveBalance, int noofdays, Date dateFrom,
			Date dateTo, String status, Employee empId) {
		super();
		LeaveBalance = leaveBalance;
		this.noofdays = noofdays;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.status = status;
		EmpId = empId;
	}

	public LeaveHistory(int leaveId, int leaveBalance, int noofdays,
			Date dateFrom, Date dateTo, String status, Employee empId) {
		super();
		LeaveId = leaveId;
		LeaveBalance = leaveBalance;
		this.noofdays = noofdays;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.status = status;
		EmpId = empId;
	}

	public int getLeaveId() {
		return LeaveId;
	}

	public void setLeaveId(int leaveId) {
		LeaveId = leaveId;
	}

	public int getLeaveBalance() {
		return LeaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		LeaveBalance = leaveBalance;
	}

	public int getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmpId() {
		return EmpId;
	}

	public void setEmpId(Employee empId) {
		EmpId = empId;
	}

}
