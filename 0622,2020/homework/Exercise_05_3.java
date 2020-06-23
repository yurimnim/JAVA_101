class Exercise_05_3 {
	public static void main(String[] args) {
		
		int i = 0, sum = 0;

		while (i < 10) {
			i++;
			if(i % 3 == 0) continue;
			System.out.println(i);

			sum += i; // sum = sum + i
			if (sum > 20) break;
			System.out.println(sum);

		}
  }
}
/*
1
2
4
5
7
8
10

왜 sum 을 프린트 시키면
1
1
2
3
4
7
5
12
7
19
8
이 나오는가?

*/