package com.bit.exam04;

class MyUtil {
	public static void drawAll(GameCharacter []arr) {
		for(GameCharacter g:arr) {
			g.draw();		
		}
	}
}

public class GameTest {
	
	public static void main(String[] args) {
//		GameCharacter g1 = new Hobitt();
//		((Hobitt)g1).getRing();
		
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
