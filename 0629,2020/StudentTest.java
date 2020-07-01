import java.util.Scanner;

class StudentTest {
	public static void main(String[] args) {
		
		String []name = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		int []avg = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0;  i <5; i++) {
			System.out.println( (i+1) + " 번쨰 학생의 이름 ==>");
			name[i] = sc.next();

			System.out.println( (i+1) + " 번쨰 학생의 국어점수 ==>");
			kor[i] = sc.nextInt();

			System.out.println( (i+1) + " 번쨰 학생의 영어점수 ==>");
			eng[i] = sc.nextInt();

			System.out.println( (i+1) + " 번쨰 학생의 수학점수 ==>");
			math[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i]/3;	
		}

		for (int i = 0; i < 5;i++) {
			for (int j = i+1; j <5; j++ ){
				if (tot[j] > tot[i]){
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;

					int t = kor[i];
					kor[i] = kor[j];
					kor[j] = t;

					t = eng[i];
					eng[i] = eng[j];
					eng[j] = t;

					t = math[i];
					math[i] = math[j];
					math[j] = t;
					
					t = avg[i];
					avg[i] = avg[j];
					avg[j] = t;

					t = tot[i];
					tot[i] = tot[j];
					tot[j] = t;

				}
			}
		}

		System.out.println("***성적결과***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < 5; i++ ){
			System.out.println(name[i] + "\t" + kor[i] +  "\t" + eng[i] +  "\t" + math[i] +  "\t" + tot[i] +  "\t" + avg[i]);
		}
	}
}
