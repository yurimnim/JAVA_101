package com.bit.exam07;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RsPaper {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> rsp = new HashMap<Integer,String>();
		rsp.put(0, "가위");
		rsp.put(1, "바위");
		rsp.put(2, "보");
		
		System.out.println("0:가위,1:바위,2:보-숫자 중 하나를 입력하시오");
		int input = sc.nextInt();
		
		String value = rsp.get(rand.nextInt(3));
		
		System.out.println("컴퓨터는 " + value + " 를 냈습니다.");
		
		if(value.equals("가위")) {
			switch(input) {
				case 0:System.out.println("비겼습니다");break;
				case 1:System.out.println("이겼다!");break;
				case 2:System.out.println("졌다");break;
			}		
		} else if (value.equals("바위")) {
			switch(input) {
			case 0:System.out.println("이겼다!");break;
			case 1:System.out.println("비겼다");break;
			case 2:System.out.println("졌다");break;
			}
		} else {
			switch(input) {
			case 0:System.out.println("!");break;
			case 1:System.out.println("비겼다");break;
			case 2:System.out.println("졌다");break;
			}
		}

	}

}
