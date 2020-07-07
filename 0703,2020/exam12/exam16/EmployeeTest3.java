package com.bit.exam16;


abstract class Employee
{
	protected String name;
	protected String no;
	protected int salary;	//�Ǽ��ɾ�
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
	private int level;	//ȣ��
	private int base;	//�⺻��
	private int comm;	//����
	
	public String toString(){
		String r =  super.toString()+"\n";
		r = r + "ȣ��:" + level + "\n";
		r = r + "�⺻�� : " + base + "\n";
		r = r + "����:" + comm + "\n";
		r = r + "�Ǽ��ɾ� : " + salary ;
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
	private int base;   //�ð��� �ӱ�
	private int hours;  //���� �ð�
	
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
		r = r + "�ð��� �ӱ� : " + base + "\n";
		r = r + "���� �ð�:" + hours + "\n";
		r = r + "�Ǽ��ɾ� : " + salary ;
		return r;
	}
}

class  EmployeeTest
{
	public static void main(String[] args) 
	{
		SalariedEmployee e1 = new SalariedEmployee("�̼���","191111",3);

		HourlyEmployee e2 = new HourlyEmployee("�̿���", "192222", 50000, 56);
		
		e1.computeSalary();
		e2.computeSalary();
			
		System.out.println(e1);
		System.out.println(e2);
	}
}
