class Ex9 {
	public static void main(String[] args) {
		int []a ={1,2,3,4,5};
		int []b ={1,2,3,4,5,6,7,8};
		int i=0;
		boolean flag = true;
		
		//두 배열의 길이가 같은지 부터 진단 
		if (a.length != b.length){
			System.out.println("배열의 내용이 일치하지 않습니다.");
			return;
		}

		for (i = 0;i <a.length ; i++){	
			if (a[i] != b[i]) {
				flag = false;	
				break; //같지않은 요소를 하나라도 만나면 탈출시켜야함 
		 }
		}
		if (i == a.length){
				System.out.println("배열의 내용이 일치합니다"); //탈출하지 않고 배열을 다 돌았으면 일치 
			}else
				System.out.println("배열의 내용이 일치하지 않습니다.");
		
	}	
}
