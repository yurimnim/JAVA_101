package com.bit.exam05;

import java.util.StringTokenizer;


public class StringTokenizerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "���,����,����,������";
		StringTokenizer st = new StringTokenizer(data,",",true);
		
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}
	}
}
