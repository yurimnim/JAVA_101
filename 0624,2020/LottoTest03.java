//1 ���� 45���� ���� 6���� �迭�� ��ƺ���
//�����Ͱ� �ߺ����� �ʵ��� ���� 

import java.util.Random;

class LottoTest03 {
	public static void main(String[] args) {
		
		Random rand = new Random();

		int []a = new int[6];

		for(int i = 0; i < 6; ) {
				int n = rand.nextInt(45) + 1; // rand.nextInt(46) �ϸ� 0�� ������!!!!
				//�̹� �迭�� ������ �Ʒ��� �������� �ʰ��ϱ� (continue)
				boolean flag = false;
				for(int j = 0; j < i; j++) { 
					if (a[j] == n ) {
						flag = true;
						break;
					} 
				}
				if (flag == true) {
					continue; // ���� ���ڸ� �Ʒ� �������� �������� ���� 
				}
				a[i] = n;
				i ++;
		}

		//���� �����ź��� ū�� ������� ������ ���� �������� ����
		for (int i = 0; i < 6; i++ ) {
			for (int j = i + 1; j < 6; j++ ){
				if( a[j] < a[i] ) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
			}
		 }
		}

		System.out.println("�����մϴ�. ��÷��ȣ!!!  ");
		for (int i = 0; i < 6 ; i++ ) {
			System.out.print(a[i] + "  ");
		}
	
 }
}