class BreakTest {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i ++) {
			if (i % 5 == 0) {
				break;// if ���ǽ� �ȿ� ������ ������  for �� Ż��
			}
			System.out.println(i);
		}
		System.out.println("�۾�����!");
	}
}