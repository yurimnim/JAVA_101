class MethodTest3 {
	public static void sayHello(String name, int n) { //�Ű����� ���� 
		for(int i =1; i<=n; i++){
		System.out.println( name + "�߾ȳ�!!");
		}
	}//�޼ҵ��� ���� 

	public static void main(String[] args) {
		sayHello("��ȣ", 5);
		int year = 2020;
		System.out.println(year);
		sayHello("�Ѹ�", 2);
		String title = "�����ֱ�";
		System.out.println(title);
		sayHello("��ġ", 10);

	}
}