package com.bit.exam05;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "¥���,«��,������,�ø�";
		String[] arr = data.split(",");
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
