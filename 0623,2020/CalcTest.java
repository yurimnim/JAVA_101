/*
	java Calc Test + 2 3
	 ���α׷� ����ÿ� ���θ޼ҵ忡 ������ ���� ���� 
	 ù��°�� ������, �ι�° ����°�� int 
	 ����ÿ� ������ �Ǵ� * �� ���ϵ�ī��� ����� �ǹǷ� 
	 ���� X �� ó�� 

*/


class  CalcTest {
	public static void main(String[] args) {
		
		String op = args[0]; //ù��° �Է¿� ������ ����
		int num1 = Integer.parseInt(args[1]);  //�ι�° ���� ��Ʈ���� int �� ��ȯ 
		int num2 = Integer.parseInt(args[2]); //����° ���� ��Ʈ���� int �� ��ȯ 
		int result = 0;

		//op �����ڿ� ���� �ٸ��� ��ȯ 
		switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "X": result = num1 * num2; break;
			case "/": 
				if (num2 == 0) {
					System.out.println("�и� �Է¿���");
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
