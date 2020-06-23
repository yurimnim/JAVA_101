//구구단 2단 출력  WHILE 문 작성 
/*
class DoubleTwo {
	public static void main(String[] args) {
		
		int i = 0;
		while(i <= 9) {
			i = i + 1;
			System.out.println("2 * " +  i + " = "  + 2*i) ;
		}
		System.out.println(i);
  }

}
*/

class DoubleTwo {
public static void main(String[] args) {
	int dan = 2;
	int i =1;
	while(i <= 9) {
		System.out.println(dan + "*" + i + "=" + (dan*i));
		i = i+1;
  }
 }
}