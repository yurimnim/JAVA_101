import java.util.Scanner;
import java.util.Random;

class RandomNumberTest {

  	public static void main(String[] args) {
  		
  		Scanner sc = new Scanner(System.in);
  		int input;
  		Random rand = new Random();
  		int luckyNumber = rand.nextInt(101);
  		//System.out.println(luckyNumber); //테스트용 

  		System.out.println("+++++++!숫자맞추기 게임!++++++++");

  		int count = 0;
  		
  			do { 
  				System.out.println("1 부터 100 까지의 수를 입력하세요!");
  				input = sc.nextInt();

  				if (input > luckyNumber) {
  					System.out.println("DOWN");
  					count = count + 1;
  				} else if (input < luckyNumber) {
  					System.out.println("UP");
  					count = count + 1;
  				} else {
  					count = count + 1;
  					break;
  				  } 
  				} while(true);

  				System.out.println("+++숫자를 맞췄습니다!+++ 럭키넘버는 " + luckyNumber);
  				System.out.println("시도횟수: " + count);

  			} 
  	}
	
