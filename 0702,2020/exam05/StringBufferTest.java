package com.bit.exam05;


public class StringBufferTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" java");//객체의 값이 변경 쓰레기가 생기지 않음 
		System.out.println(sb);

	}

}
