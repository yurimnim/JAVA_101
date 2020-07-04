//문자열 입력, 거꾸로 출력 

package com.bit.exam06;

import java.util.Scanner;

public class StringTest01 {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  String myWord;
	  
	  System.out.print("문자를 입력하시오-->");
	  myWord = sc.nextLine();
	  
	  
	  for(int i = myWord.length() - 1; i>=0 ; i--) {
		  System.out.print(myWord.charAt(i));
	  }
 }
}
