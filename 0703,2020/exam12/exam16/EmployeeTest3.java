package com.bit.exam16;


abstract class Employee
{
	protected String name;
	protected String no;
	protected int salary;	//실수령액
	public String toString(){
		String r = "\n"+ name + "," + no;
		return r;
	}
	public Employee(String name, String no){
		this.name = name;
		this.no = no;
	}
	abstract public void computeSalary();

}

class SalariedEmployee extends Employee
{
	private int level;	//호봉
	private int base;	//기본급
	private int comm;	//수당
	
	public String toString(){
		String r =  super.toString()+"\n";
		r = r + "호봉:" + level + "\n";
		r = r + "기본금 : " + base + "\n";
		r = r + "수당:" + comm + "\n";
		r = r + "실수령액 : " + salary ;
		return r;
	}

	public SalariedEmployee(String name, String no, int level)
	{
		super(name, no);
		this.level = level;
	
	}

	public void computeSalary(){
		switch(level){
			case 1: base = 100; comm = 10;break;
			case 2: base = 200; comm = 20;break;
			case 3: base = 300; comm = 30;break;
		}
		salary = base + comm;
	}
}

class HourlyEmployee extends Employee
{
	private int base;   //시간당 임금
	private int hours;  //일한 시간
	
	public HourlyEmployee(String name, String no, int base, int hours){
		super(name, no);
		this.base = base;
		this.hours = hours;
	}

	public void computeSalary(){
		salary = base * hours;
	}

	public String toString(){
		String r =  super.toString()+"\n";
		r = r + "시간당 임금 : " + base + "\n";
		r = r + "일한 시간:" + hours + "\n";
		r = r + "실수령액 : " + salary ;
		return r;
	}
}

class  EmployeeTest
{
	public static void main(String[] args) 
	{
		SalariedEmployee e1 = new SalariedEmployee("이수인","191111",3);

		HourlyEmployee e2 = new HourlyEmployee("이원우", "192222", 50000, 56);
		
		e1.computeSalary();
		e2.computeSalary();
			
		System.out.println(e1);
		System.out.println(e2);
	}
}
