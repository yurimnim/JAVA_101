class Ex9 {
	public static void main(String[] args) {
		int []a ={1,2,3,4,5};
		int []b ={1,2,3,4,5,6,7,8};
		int i=0;
		boolean flag = true;
		
		//�� �迭�� ���̰� ������ ���� ���� 
		if (a.length != b.length){
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			return;
		}

		for (i = 0;i <a.length ; i++){	
			if (a[i] != b[i]) {
				flag = false;	
				break; //�������� ��Ҹ� �ϳ��� ������ Ż����Ѿ��� 
		 }
		}
		if (i == a.length){
				System.out.println("�迭�� ������ ��ġ�մϴ�"); //Ż������ �ʰ� �迭�� �� �������� ��ġ 
			}else
				System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
		
	}	
}
