import java.util.Scanner;

class Student {	
	String name; 
	int kor;
	int eng;
	int math;
	int tot;
	int avg;
} // ����� ���� �ڷ���: Ŭ������ ���� ���ο� ��.��.��!  *******DATA TYPE******** 

class StudentTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student []s = new Student[5]; //��ü�� ������ �������� 5�� ���� (���� ��ü�� ������ ���� �ƴ�)

		for (int i = 0; i<5 ;i++ ){
			s[i] = new Student(); //��ü�� ������ ����� �Է��� ����! 

			System.out.println( (i+1) + "��° �л��� �̸��� �Է��Ͻÿ�.");
			s[i].name = sc.next();
			System.out.println( (i+1) + "��° �л��� ���������� �Է��Ͻÿ�.");
			s[i].kor = sc.nextInt();
			System.out.println( (i+1) + "��° �л��� ���������� �Է��Ͻÿ�.");
			s[i].eng = sc.nextInt();
			System.out.println( (i+1) + "��° �л��� ���������� �Է��Ͻÿ�.");
			s[i].math = sc.nextInt();
			s[i].tot = s[i].kor + s[i].eng + s[i].math;
			s[i].avg = s[i].tot / 3;

		}

		for (int i = 0; i <5 ;i++){
			for(int j = i+1; j<5; j++ ){
				if (s[j].tot > s[i].tot){
					Student temp =s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}

		System.out.println(" *** ������� *** ");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i<5 ; i++ ) {
			System.out.println(s[i].name +"\t" + s[i].kor +"\t" + s[i].eng +"\t" + s[i].math +"\t" + s[i].tot +"\t" + s[i].avg); 
		}
  }
}