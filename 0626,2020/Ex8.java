
class Ex8  {
	public static void main(String[] args){
		int []a = {1,2,3,4,5}; //��������
		int []b = new int[a.length]; 
		
		
		//b = a;

		//a[0] = 100;
				
		//System.out.println(a[0]);
		//System.out.println(b[0]);
		//���簡 �ƴ϶� �����ڷḦ �����ϰ� �ִ°��ϻ�...


		
			for (int i= 0;i<a.length ;i++ ){
			b[i] = a[i];
			} 
			System.out.println(a[0]);
			System.out.println(b[0]);
			a[0] = 100;

			System.out.println(a[0]);
			System.out.println(b[0]);
 }
}
