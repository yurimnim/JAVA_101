package com.bit.exam06;
import java.util.Scanner;

public class WordTest {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String myWord;
	
	System.out.println("문자열을 입력하세요:");
	myWord = sc.nextLine().trim();
	
	int count = 0;
	
	
	for(int i = 1; i<myWord.length() - 1; i++) {
 	 if(myWord.charAt(i) == ' ' && myWord.charAt(i-1) != ' ') {
 		 	count++;
 	 	}
 	}
	
	System.out.println(myWord + " 속에 단어는 " + (count+1) + "개");

 	}		
 }

