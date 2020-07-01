import java.util.Scanner;

class Student {	
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	int avg;
}


class StudentTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		age = 10;
		Student s;
		s = new Student();// "객체생성" 해야지만 클래스 사용가능 
		//s 속에는 위에 6가지의 자료형이 하나에 담겨있음!!!
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 80;
		s.math = 100; // 멤버변수연산자 
		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot/3 ;

		System.out.println ("이름 : " + s.name);
		System.out.println ("국어 : " + s.kor);
		System.out.println ("영어 : " + s.eng);
		System.out.println ("수학 : " + s.math);
		System.out.println ("총점 : " + s.tot);
		System.out.println ("평균 : " + s.avg);

 }
}