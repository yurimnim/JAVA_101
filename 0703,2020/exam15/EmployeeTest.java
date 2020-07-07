package com.bit.exam15;

abstract class Employee {
	protected String name;
	protected String empNo;
	
	public Employee(String name, String empNo) {
		this.name = name;
		this.empNo = empNo;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	abstract int computeSalary(int a);
}

class SalariedEmployee extends Employee {

	public SalariedEmployee(String name, String empNo) {
		super(name, empNo);
	}

	@Override
	public int computeSalary(int month) {
		return 1600 * month;
	}
}

class HourlyEmployee extends Employee {

	public HourlyEmployee(String name, String empNo) {
		super(name, empNo);
	}
	
	public int computeSalary(int hrs) {
		return 12*hrs;
  }	
}

public class EmployeeTest {
	public static void main(String[] args) {
		HourlyEmployee h = new HourlyEmployee("둘리", "d119");
		System.out.println("이름:" + h.getName() + ", 직원번호:" + h.getEmpNo() + ", 이번달 월급:" +  h.computeSalary(20) + "원");
		
		SalariedEmployee k = new SalariedEmployee("고길동", "k112");
		System.out.println("이름:" + k.getName() + ", 직원번호:" + k.getEmpNo() + ", 이번달 월급 :" + k.computeSalary(5) + "원");
	}

}
