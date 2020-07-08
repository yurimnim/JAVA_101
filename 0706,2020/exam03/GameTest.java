package com.bit.exam03;

class MyUtil {
	public static void drawAll(Object []arr) {
		System.out.println("모두출력합니다");
		for(Object g:arr) {
			if(g instanceof Hobitt) {
				((Hobitt)g).draw();
			} else if(g instanceof Titan){
				((Titan)g).draw();
			} else{
				((Sorcerer)g).draw();
			}
		}
	}
}

public class GameTest {
	
	public static void main(String[] args) {
		GameCharacter[] arr = new GameCharacter[6];
		arr[0] = new Hobitt();
		arr[1] = new Titan();
		arr[2] = new Sorcerer();
		arr[3] = new Sorcerer();
		arr[4] = new Hobitt();
		arr[5] = new Titan();
		
		MyUtil.drawAll(arr);
	 }
}
