
class  CalcTest02 {
	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("실행시 연산할 데이터를 전달해주세요.");
			return;
		}
		
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
