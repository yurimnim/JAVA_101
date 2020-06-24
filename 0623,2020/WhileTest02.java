/*
	연습) 다음을 프로그래밍 하세요.
	1+2+3+.......n
	의 합이 100을 넘지 않는 가장 큰 n를 찾아 출력하세요.
*/

class WhileTest02 
{
	public static void main(String[] args) {
		int i=1;
		int sum = 0;

		while(true){
			sum = sum + i;
			System.out.println("i:" + i + ", sum:" + sum);
			if(sum > 100)
				break;
			i++;
		}
		
		System.out.println("i값은:" + i);
		System.out.println("sum값은:" + sum);
		
		sum = sum - i;
		i = i - 1;
		System.out.println("100을 넘지 않는 합:" + sum);
		System.out.println("누적된 합이 100을 넘지 않은 가장 큰 n " + i);

	}
}
