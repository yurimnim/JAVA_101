/*
 
 */

class PrimeNumber03 {
	
	public static void main(String[] args) {
		
		// ���� �ϳ��� �Ҽ����� �Ǻ��ϴ� �ڵ带 �ݺ��� ���� �Ұ���
		for(int n = 2; n < 100; n++) {
				boolean isPrime = true;
				if ( n == 1) {
					System.out.println("�Ҽ��� �ƴմϴ�.");
					 return;
				}

				 //����� ������ ī��Ʈ ����

				for (int i =2; i<n; i++) {
					if (n % i == 0) {
						isPrime = false;
						break; //�� ���ϸ� ��� ������ ���ƹ��� 
					}
				}	
				if (isPrime) { 
					System.out.println("�Ҽ��Դϴ�.");
				} else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}
		 }
 }
}