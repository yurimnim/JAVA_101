/*
	java Calc Test + 2 3
	 프로그램 실행시에 메인메소드에 데이터 전달 가능 
	 첫번째는 연산자, 두번째 세번째는 int 
	 실행시에 전달이 되는 * 는 와일드카드로 기록이 되므로 
	 영문 X 로 처리 

*/


class  CalcTest {
	public static void main(String[] args) {
		
		String op = args[0]; //첫번째 입력에 연산자 저장
		int num1 = Integer.parseInt(args[1]);  //두번째 오는 스트링을 int 로 변환 
		int num2 = Integer.parseInt(args[2]); //세번째 오는 스트링을 int 로 변환 
		int result = 0;

		//op 연산자에 따라서 다르게 변환 
		switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "X": result = num1 * num2; break;
			case "/": 
				if (num2 == 0) {
					System.out.println("분모 입력오류");
					return;
				}
				result = num1 / num2; break;
			case "%": result = num1 % num2; break;
		}

		System.out.println(num1 + op + num2 + " = " + result);
		
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);

	}
}
