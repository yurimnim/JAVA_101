package com.bit.exam11;

abstract class Book {
	protected String number;
	protected String title;
	protected String author;

	@Override
	public boolean equals(Object obj) {
		boolean re = false;
		Book b = (Book)obj;
		if(number.equals(b.getNumber())){
			re = true;
		}
		return re;
	}

	public Book(String number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFees(int days);	
}

class Novel extends Book {

	public Novel(String number, String title, String author) {
		super(number, title, author);
	}

	@Override
	public int getLateFees(int days) {
		return 300 * days;
	}
}

class Poet extends Book {
	public Poet(String number, String title, String author) {
		super(number, title, author);		
	}
	
	public int getLateFees(int days) {
		return days * 200;
	}		
}

class ScienceFiction extends Book {

	public ScienceFiction(String number, String title, String author) {
		super(number, title, author);
	}
	
	public int getLateFees(int days) {
		return days * 600;
	}
}

public class BookTest {
	public static void main(String[] args) {
//		Book b = new Book("b1234", "javaman", "java kim");
//		��üȭ �����ʴ� �߻�޼ҵ带 �����ִ� �߻�Ŭ������ ��ü�� ������ �� ����. 
		
		Novel n1 = new Novel("n0001","Javaman", "Java lim");
		Novel n2 = new Novel("n0001","Javaman", "Java lim");
		
		if(n1.equals(n2)){
			System.out.println("��å�� ���ƿ�");
		}else  {
			System.out.println("��å�� �޶��");
		}
		
		/*
		if(n1==n2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		*/
		
		/*
		Poet p1 = new Poet("p0001", "The world of Java", "java kim");
		ScienceFiction s1 = new ScienceFiction("s0001", "Java infinite", "java ko");
		
		System.out.println(n1.getTitle() + "/ ��ü��:" + n1.getLateFees(2));
		System.out.println(p1.getTitle() + "/ ��ü��:" + p1.getLateFees(2));
		System.out.println(s1.getTitle() + "/ ��ü��:" + s1.getLateFees(2));
		*/
		
		//������ ��ü n1,p1,s1 ���� �� �޼����� ���������� ��ü���� �����ϴ� ����� �ٸ� 
		//�̰��� "������" �̶����. 
	}
}
