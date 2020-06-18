
class InitialTest02 {

	public static void main(String[] args) {
		int score = 80;
		String r = "";

		if (score>=90)
			r = "우수";
		else if (score>=80)
			r = "ok";
		
		System.out.println(r);
	}
}

/*
score  가 80 이상일 때 r 결정 그 의외상태에서는 r의 값이 결정되지 않은 상태에서 출력문을 만날 수 있으므로
오류가 발생, 이것을 해결하기 위해서는 String r; 이라고 하지않고
String r =""; 과 같이 처음 시작하는 값(초기값) 설정하기
*/