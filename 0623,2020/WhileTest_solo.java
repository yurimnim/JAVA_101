
class WhileTest_solo {
	public static void main(String[] args)  {
		int i = 1;
		int sum = 0;

		while(true) {
			sum = sum + i;
			System.out.println("i ���� " + i + "sum value is " + sum);
			if (sum < 100) 
				break;
			i++;
		}
		System.out.println("i�� ����:" + i);
		System.out.println("sum�� ����:" + sum);

		sum = sum - i;
		i = i - 1;
		
		System.out.println("100�� ���� �ʴ� ��:" + sum);
		System.out.println("������ ���� 100�� ���� ���� ���� ū n " + i);

 }
}