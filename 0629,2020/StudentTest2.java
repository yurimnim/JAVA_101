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
		s = new Student();// "��ü����" �ؾ����� Ŭ���� ��밡�� 
		//s �ӿ��� ���� 6������ �ڷ����� �ϳ��� �������!!!
		s.name = "ȫ�浿";
		s.kor = 100;
		s.eng = 80;
		s.math = 100; // ������������� 
		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot/3 ;

		System.out.println ("�̸� : " + s.name);
		System.out.println ("���� : " + s.kor);
		System.out.println ("���� : " + s.eng);
		System.out.println ("���� : " + s.math);
		System.out.println ("���� : " + s.tot);
		System.out.println ("��� : " + s.avg);

 }
}