//�л��� �̸�, ����, ����, ������ �Է¹޾� 
// ����� 60�� �̻��̸� �հ�,  �׷��� ������ ���հ� ���

import java.util.Scanner;

class StudentTest {
   
   public static void main (String[] args) {
		String name;
		int kor, eng, math, tot, avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸�: ");
		name = sc.next();

		System.out.println("����: ");
		kor = sc.nextInt();

		System.out.println("����: ");
		eng = sc.nextInt();

		System.out.println("����: ");
		math = sc.nextInt();

		tot = kor + eng + math;
		avg = tot / 3;
		
		System.out.println("�л��̸�: " + name);
		System.out.println("�������: " + avg);

		if (avg >= 60)
			System.out.println("�հ�"); 
		else 
			System.out.println("���հ�");
		
     }
   }