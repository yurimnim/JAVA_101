
class  SumArray02 {
	public static void main(String[] args) {

		int []arr = {36, 33, 28, 26, 31}; // �迭
		int sum = 0;
		
		//for each �ݺ��� 
		//�����ʿ� �迭�̸�, �� �迭 �ȿ� �ִ°� ������ ����(�迭 �ȿ� data)
		for (int i : arr ) {
			sum = sum + i;
		}
		System.out.println("ȫ�α��� ������ ������ " + sum);
  }
 }
