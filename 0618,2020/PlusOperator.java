class PlusOperator {

	public static void main(String[] args) {
		
		System.out.println('A' + 1);
		System.out.println(""+'A' + 'B');
		//연결하려면 무줙건 String 데이터가 필요 나머지 데이터는 그냥 연산해버린다.
		
		/*
		int num -= 65;
		char data = (char)num;
		System.out.println(data);

		/*
		char data = 'A';
		int num = (int)data;
		System.out.println(num);
		System.out.println(data);

		/*
		System.out.println(100+200); // 300
		System.out.println("100"+ "200"); //100200
		System.out.println("100" + 200); //100200
		System.out.println("100" + 'A'); // 100A
		System.out.println(5 + "100"); //5100
		System.out.println('A' + "100"); //A100

		//연결해줄려면 String 이 있어야함 
		*/
	}
}