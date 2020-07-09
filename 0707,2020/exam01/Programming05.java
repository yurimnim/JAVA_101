package com.bit.exam01;


class Person implements Comparable{
	private String name;
	private double height;
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	//SET GET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	@Override
	public int compareTo(Object o) {
		Person t = (Person)o;
		int re = 0;
		if(height > t.height) {
			re = 1;
		}else if (height < t.height) {
			re = -1;
		}
		return re;
	}
}

public class Programming05 {
	public static String getMaximum(Person []arr) {
		Person max = arr[0];
		for(int i=1; i < arr.length; i++) {
			if(arr[i].compareTo(max) >0) {
				max = arr[i];
			}
		}
		return max.getName(); 
	}
	
	public static void main(String[] args) {
		Person []arr = new Person[3];
		arr[0] = new Person("고길동", 165);
		arr[1] = new Person("또치", 160);
		arr[2] = new Person("둘리", 120);
		
		System.out.println("가장 키큰사람:" + getMaximum(arr));
	}

}
