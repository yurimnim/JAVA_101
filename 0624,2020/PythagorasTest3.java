class PythagorasTest3 
{
	public static void main(String[] args) 
	{
		int cnt = 0;
		for(int a=1;a<=100;a++){
			for(int b=1;b<=100;b++){
				for(int c=1;c<=100;c++){
						if(   ((a*a + b*b) == c*c) && (a>b) )
						{
							System.out.println("a="+a+",b="+b+",c="+c);
							cnt++;
						}// end if
					
				}//end for  c
			}//end for b
		}//end for a

		System.out.println("피타고라스 정리를 만족하는 삼각형의 수는 " + cnt);
	}
}
