class ShortcutOperation {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7; 
		if (a > 10 & ++b > 10)
			System.out.println("��� 10���� Ů�ϴ�.");
		else 
			System.out.println("10���� ũ�� �ʽ��ϴ�.");

		System.out.println(b);
	}
}

// && : ������ �̹�  false �� ������ �ڴ� ó���� ���� (shortcut operation)
// &: ������ false �� �ص� ���� �ͱ��� ��� �� ó�� ��


