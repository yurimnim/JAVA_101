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
		System.out.println("연체료 " + 300 * overdue + "원 ");
	}
}

class Poet extends Book {
	public Poet(String number, String title, String author) {
		super(number,title,author);
	}
	
	
	public void getLateFees(int overdue) {
		System.out.println("연체료 " + 200 * overdue + "원 ");
	}
}

class ScienceFiction extends Book {
	public ScienceFiction(String number, String title, String author) {
		super(number,title,author);
	}
	
	
	public void getLateFees(int overdue) {
		System.out.println("연체료 " + 600 * overdue + "원 ");
	}
}

public class BookTest {
	public static void main(String[] args) {
		ScienceFiction sf = new ScienceFiction("222", "둘리의대모험", "고길동");
		Novel nv = new Novel("222", "둘리의대모험", "고길동");
		
		sf.getLateFees(4);
		
	} 
}




