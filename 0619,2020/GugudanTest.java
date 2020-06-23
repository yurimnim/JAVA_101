
class GugudanTest {

	public static void main(String[] args) {
		
		
		/*
		System.out.println(dan +"*" + 1 + "=" + (dan*1));
		System.out.println(dan +"*" + 2 + "=" + (dan*2));
		System.out.println(dan +"*" + 3 + "=" + (dan*3));
		System.out.println(dan +"*" + 4 + "=" + (dan*4));
		System.out.println(dan +"*" + 5 + "=" + (dan*5));
		System.out.println(dan +"*" + 6 + "=" + (dan*6));
		System.out.println(dan +"*" + 7 + "=" + (dan*7));
		System.out.println(dan +"*" + 8 + "=" + (dan*8));
		System.out.println(dan +"*" + 9 + "=" + (dan*9));
		*/
		//반복문 이용해 고치자 
		for (int dan = 2; dan  <=9 ;dan ++ ) {
			System.out.println ("***" + dan + "단***");

			for (int i = 1; i <= 9 ; i++) {
				System.out.println(dan +"*" + i + "=" + (dan*i));
			} 
		System.out.println ( );	
	}
  }
}