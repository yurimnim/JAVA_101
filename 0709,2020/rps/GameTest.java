package com.bit.rps;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "가위");
		map.put(1, "바위");
		map.put(2, "보");
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int com = r.nextInt(3);
		
		System.out.print("하나를 선택하시오. 0.가위 1.바위 2.보 ==>");
		int user = sc.nextInt();
		
		
		System.out.println("컴퓨터는 " + map.get(com) + "를 냈습니다");
		System.out.println("나는 " + map.get(user) + "를 냈습니다");
		
		//비겼냐,졌냐 이겼냐 --이거 순으로 물어봐야 코드가 짧아짐 
		
		if(com==user) {
			System.out.println("비겼다!");
		}else if((user==0 && com==2) && (user==1 && com==0) && (user==2 && com==1)) {
			System.out.println("이겼다!");
		}else {
			System.out.println("졌다");
		}
	}
}
