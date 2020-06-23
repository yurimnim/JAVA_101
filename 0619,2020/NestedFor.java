
class NestedFor {
	public static void main(String[] args) {
		
		for(int i = 1; i <=3; i++) { //3번

			for(int j = 1; j <= 5; j++) {		//5번 
				System.out.println("hello"); //15번 출력
			}	
		}
	 }
}