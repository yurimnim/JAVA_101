package com.bit.exam10;

class Book {
	String number;
	String title;
	String author;
	boolean sameBook;
	
	public Book(String number,String title,String author) {
		this.number =  number;
		this.title = title;
		this.author = author;
	}
	
	public boolean bookScan(int n) {
		sameBook = false;
		if(number.equals(n)) {
			return true; 
		}
		return sameBook;	
	}
}

class Novel extends Book {
		
	public Novel(String number, String title, String author) {
		super(number,title,author);
	}
	
	
	public void getLateFees(int overdue) {
		System.out.println("��ü�� " + 300 * overdue + "�� ");
	}
}

class Poet extends Book {
	public Poet(String number, String title, String author) {
		super(number,title,author);
	}
	
	
	public void getLateFees(int overdue) {
		System.out.println("��ü�� " + 200 * overdue + "�� ");
	}
}

class ScienceFiction extends Book {
	public ScienceFiction(String number, String title, String author) {
		super(number,title,author);
	}
	
	
	public void getLateFees(int overdue) {
		System.out.println("��ü�� " + 600 * overdue + "�� ");
	}
}

public class BookTest {
	public static void main(String[] args) {
		ScienceFiction sf = new ScienceFiction("222", "�Ѹ��Ǵ����", "��浿");
		Novel nv = new Novel("222", "�Ѹ��Ǵ����", "��浿");
		
		sf.getLateFees(4);
		
	} 
}




