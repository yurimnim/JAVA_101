class WhileTest {
	public static void main(String[] args) {
		
		int i = 0, sum = 0;

		while (i < 10) {
			i++; // 0 1 2 3 4 5 6 7 8 9 �׽�Ʈ 
			if(i % 3 == 0) continue; // 3�� ����� ó������ ���ư��� �ٽ� �ݺ��� ���� 
			System.out.println(i); // 3�� ����� �ƴϸ� ����Ʈ 

			sum += i; // sum = sum + i //i �� ��� ����
			if (sum > 20) break;  //�����ؼ� ���� i ���� 20���� Ŭ �� Ż�� 
		
		}

			System.out.println("sum ���� " + sum + "�϶� Ż��");
			System.out.println("i ���� " + i + " �϶� Ż��");
  }
}