class  IfCountTest{
	public static void main(String[] args) {
		
		int []list = {36,32,28,26,30};
		
		int count = 0;
		
		// array �ȿ� index �˻� 
		for(int i = 0 ; i < 5; i++) {
			if (list[i] > 19 && list[i] < 30) {
				count++;  // if ��/  FOR�� �ȿ� ����Ʈ�� �ϸ� ������ ���� �� ���� ����Ʈ �ع��� �ΰ� �� �������ͼ� ����Ʈ �־�� �� 
			}	
		}	
		System.out.println(count);
	}

}