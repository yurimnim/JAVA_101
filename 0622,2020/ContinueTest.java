class ContinueTest {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i ++) {
			if (i % 5 == 0) {
				continue; // �� ������ ������ ���� ���ǽ��� �������� �ʱ� (pass �ϱ�) 
			}
			System.out.print(i);
		}
		System.out.println("�۾�����!");
	}
}