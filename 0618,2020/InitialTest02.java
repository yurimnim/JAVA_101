
class InitialTest02 {

	public static void main(String[] args) {
		int score = 80;
		String r = "";

		if (score>=90)
			r = "���";
		else if (score>=80)
			r = "ok";
		
		System.out.println(r);
	}
}

/*
score  �� 80 �̻��� �� r ���� �� �ǿܻ��¿����� r�� ���� �������� ���� ���¿��� ��¹��� ���� �� �����Ƿ�
������ �߻�, �̰��� �ذ��ϱ� ���ؼ��� String r; �̶�� �����ʰ�
String r =""; �� ���� ó�� �����ϴ� ��(�ʱⰪ) �����ϱ�
*/