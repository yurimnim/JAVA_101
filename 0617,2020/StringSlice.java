class StringSlice {
	public static void main(String[] args) {
		
		String jumin = "850101-1235367";
		//��������� �̾ƿ��� 
		String year = jumin.substring(0,2);
		System.out.println(year);
		
		//Convert String to int
		int birthYear = Integer.parseInt(year) + 1900;
		
		int age = 2020 -  birthYear + 1;
		System.out.println("����: " + age);
		
	}
}