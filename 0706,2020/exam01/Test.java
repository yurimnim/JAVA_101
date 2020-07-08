package com.bit.exam01;

class Student{
	private String name;
	private String department;
	private int year;
	private int credit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Student(String name, String department, int year, int credit) {
		this.name = name;
		this.department = department;
		this.year = year;
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "�л� ���� : [�̸�=" + name + ", �а�=" + department + ", �г�=" + year + ", �̼� ����=" + credit + "]";
	}
	
}

class UnderGraduate extends Student{
	String Club;

	public String getClub() {
		return Club;
	}

	public void setClub(String club) {
		Club = club;
	}

	public UnderGraduate(String name, String department, int year, int credit, String club) {
		super(name, department, year, credit);
		Club = club;
	}

	@Override
	public String toString() {
		
		System.out.println(super.toString());
		return " [���Ƹ�=" + Club + "]";
	}	
}
class Graduate extends Student{
	String assistant;
	double scholarship;
	
	public String getAssistant() {
		return assistant;
	}
	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
	@Override
	public String toString() {
		System.out.println( super.toString());
		return "[���� ����=" + assistant + ", ���б�=" + (scholarship * 100) + "%]";
	}
	public Graduate(String name, String department, int year, int credit, String assistant, double scholarship) {
		super(name, department, year, credit);
		this.assistant = assistant;
		this.scholarship = scholarship;
	}
	
}
public class Test {

	public static void main(String[] args) {
		
		Graduate g = new Graduate("��", "�İ�", 3, 25, "��������", 0.5);
		System.out.println(g.toString());
		UnderGraduate U = new UnderGraduate("��", "�İ�", 2, 20, "���");
		System.out.println(U.toString());

	}

}
