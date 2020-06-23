
class  SumArray {
	public static void main(String[] args) {


		int []arr = {36, 33, 28, 28, 31}; // ¹è¿­
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}
		System.out.println("È«µÎ±úÆÀ ³ªÀÌÀÇ ÃÑÇÕÀº " + sum);
		System.out.println("È«µÎ±úÆÀ ³ªÀÌÀÇ Æò±ÕÀº" + sum/5);
  }
 }
