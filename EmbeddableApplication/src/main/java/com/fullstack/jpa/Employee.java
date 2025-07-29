package com.fullstack.jpa;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	private String empName;

	private long empContactNumber;

	private double empSalary;

	@Embedded
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, long empContactNumber, double empSalary, Address address) {
		super();
		this.empName = empName;
		this.empContactNumber = empContactNumber;
		this.empSalary = empSalary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empContactNumber=" + empContactNumber
				+ ", empSalary=" + empSalary + ", address=" + address + "]";
	}

}
