/*
	 java AreaTest2 R
	 사각형의 가로길이? 2
	 사각형의 세로길이? 3
	 사각형의 면적은 ___
*/
import java.util.Scanner;

class AreaTest02 {
	public static void main(String[] args) {
		String type = args[0];
		if (args.length != 1) {
			System.out.println("도형종류 입력오류");
			return;
		}
		if (!type.equals("T") && !type.equals("R") && !type.equals("S")) {
			System.out.println("도형종류 입력오류: R/T/S  중에 하나로 입력하시오.");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		String typeResult = "";
		double width, height, area = 0, radius;
		switch (type){
			case "R" :
				typeResult = "사각형";
				System.out.println("사각형의 가로길이");
				width = sc.nextDouble();
				System.out.println("사각형의 세로길이");
				height = sc.nextDouble();
				area = width*height;
				break;
			case "T" :
				typeResult = "삼각형";
				System.out.println("삼각형의 가로길이");
				width = sc.nextDouble();
				System.out.println("삼각형의 세로길이");
				height = sc.nextDouble();
				area = width*height*1/2;
				break;
			case "S" :
				typeResult = "원";
				System.out.println("원 반지름의 길이:");
				 radius = sc.nextDouble();
				 area = radius*radius *3.14;
			}				
		System.out.println(typeResult + "의 면적: " + area);
 }
}