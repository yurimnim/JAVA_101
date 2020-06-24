class AlphabeticTest {
	public static void main(String[] args) {

		String str = "1";
		 boolean r = Character.isAlphabetic ( str.charAt(0) );
		System.out.println(r);
		// 한글도 알파벳으로 처리 된다고 한다.... 
	}
}
