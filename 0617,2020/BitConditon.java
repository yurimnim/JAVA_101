class BitConditon {

	public static void main(String[] args) {
		int age = 25;
		
		//나이가 20대인지 판별
		
		// && 대신에 & (비트연산자)  써줘도 기능함
		if (age >= 20 & age < 30)
			System.out.println("20대 입니다.");
		else 
			System.out.println("20대가 아닙니다.");

		//차이점이 있음 

	}
}