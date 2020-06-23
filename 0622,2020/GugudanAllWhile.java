//2단부터 9단까지 모두출력 
/*
class GugudanAllwhile {
public static void main(String[] args) {
	int i = 1;
	int j = 1;

	while(i <= 9) {
		i = i + 1;
		while (i <= 9) {
			System.out.println(i + " * " + j + "=" + i*j);
			j = j + 1;
		}
   }
 }
}
*/
	
class GugudanAllwhile {
public static void main(String[] args) {
	
	
	int dan = 2;
	while(dan <= 9) {
		System.out.println("**** " + dan + "단" + " ****");
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			i = i+1;
	  }
	  dan = dan + 1;
	  System.out.println();
  }
 }
}