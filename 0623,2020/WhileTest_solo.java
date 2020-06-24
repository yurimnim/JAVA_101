
class WhileTest_solo {
	public static void main(String[] args)  {
		int i = 1;
		int sum = 0;

		while(true) {
			sum = sum + i;
			System.out.println("i 값은 " + i + "sum value is " + sum);
			if (sum < 100) 
				break;
			i++;
		}
		System.out.println("i의 값은:" + i);
		System.out.println("sum의 값은:" + sum);

		sum = sum - i;
		i = i - 1;
		
		System.out.println("100을 넘지 않는 합:" + sum);
		System.out.println("누적된 합이 100을 넘지 않은 가장 큰 n " + i);

 }
}