/*
���� 
��������� �̸��� �ֹι�ȣ�� �Է¹޾� ���� �ϰ��� ��������� �Ǻ��ϴ� ���α׷� �ۼ�
 ó������ : ����ϰ��� ����ڴ� ������ ���� ���� : ���� 40���̻�, ������ ������ ¦������ �̸� ¦�� ������
�¾���, Ȧ���̸� Ȧ���� �¾��� . 
*/

import java.util.Scanner;
import java.util.Date;

class CancerTest05 {
    public static void main(String[] args) {
		String name, ssNo;
		Scanner sc = new Scanner(System.in);
		Date today = new Date();

		int currentYear = today.getYear() + 1900;

		System.out.println("�̸�: ");
		name = sc.next();

		System.out.println("�ֹε�Ϲ�ȣ: ");
		ssNo = sc.next();
		String year = ssNo.substring(0,2);

		int birthYear = Integer.parseInt(year) + 1900;
		int age = currentYear - birthYear + 1; 

		if (currentYear % 2 == birthYear % 2 && age >= 40)
			System.out.println(name + " ���� ���� �ϰ��� ����� �Դϴ�.");
		else 
			System.out.println(name +  " ���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
	}
}

