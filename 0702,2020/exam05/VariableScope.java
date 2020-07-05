package com.bit.exam05;

class Test {
	boolean r;
	
	public boolean a() {
		boolean r = true;
		return r;
	}
		
	public boolean b() { 
		int i =3;
		boolean r = false;
		if(i > 100) {
			r = true;
		}		
		return r;
	}
	
	public boolean c() {
		r = false;
		if (a() && b()) {
			r = true;
		}
		return r;
	}
}

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
