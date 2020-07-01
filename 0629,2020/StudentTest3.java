import java.util.Scanner;

class Student {	
	String name; 
	int kor;
	int eng;
	int math;
	int tot;
	int avg;
} // 사용자 정의 자료형: 클래스의 정의 새로운 자.료.형!  *******DATA TYPE******** 

class StudentTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student []s = new Student[5]; //객체를 생성할 참조변수 5개 생성 (아직 객체가 생성된 것이 아님)

		for (int i = 0; i<5 ;i++ ){
			s[i] = new Student(); //객체를 생성을 해줘야 입력이 가능! 

			System.out.println( (i+1) + "번째 학생의 이름을 입력하시오.");
			s[i].name = sc.next();
			System.out.println( (i+1) + "번째 학생의 국어점수를 입력하시오.");
			s[i].kor = sc.nextInt();
			System.out.println( (i+1) + "번째 학생의 영어점수를 입력하시오.");
			s[i].eng = sc.nextInt();
			System.out.println( (i+1) + "번째 학생의 수학점수를 입력하시오.");
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

		System.out.println(" *** 성적결과 *** ");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i<5 ; i++ ) {
			System.out.println(s[i].name +"\t" + s[i].kor +"\t" + s[i].eng +"\t" + s[i].math +"\t" + s[i].tot +"\t" + s[i].avg); 
		}
  }
}