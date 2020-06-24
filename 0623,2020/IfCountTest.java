class  IfCountTest{
	public static void main(String[] args) {
		
		int []list = {36,32,28,26,30};
		
		int count = 0;
		
		// array 안에 index 검사 
		for(int i = 0 ; i < 5; i++) {
			if (list[i] > 19 && list[i] < 30) {
				count++;  // if 문/  FOR문 안에 프린트를 하면 조건이 맞을 때 마다 프린트 해버림 두개 다 빠져나와서 프린트 넣어야 함 
			}	
		}	
		System.out.println(count);
	}

}