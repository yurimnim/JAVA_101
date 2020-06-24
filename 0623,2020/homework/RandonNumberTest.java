import java.util.Scanner;
import java.util.Ramdom;

class RandomNumberTest {

  	public static void main(String[] args) {
  		
  		Scanner.sc = new Scanner(System.in);
  		int input;
  		Ramdom rand = new Ramdom();
  		int luckyNumber = rand.nextInt(101);

  		System.out.println("+++++++!숫자맞추기 게임!++++++++");
  		
  			do { 
  				System.out.println("1 부터 100 까지의 수를 입력하세요!");
  				input = nextInt();

  				if(input > 0 && input < 101) {
  					break;
  				}
  				
  			} while(true);


  	}
	
}