import java.util.ArrayList;
class Data
{
	private int a;
	private int b;
	public Data(int a, int b){
		this.a = a;
		this.b = b;
	}

	public boolean equals(Object obj)
	{
		Data d =(Data)obj;
		if( (a == d.a && b == d.b) || (a == d.b && b == d.a) ){
			return true;
		}else{
			return false;
		}
	}
	
}

class PythagorasTest2 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		int cnt = 0;
		for(int a=1;a<=100;a++){
			for(int b=1;b<=100;b++){
				for(int c=1;c<=100;c++){
					Data r = new Data(a,b);
					if( !list.contains(r))
					{				
						if(   (a*a + b*b) == c*c  )
						{
							list.add(r);
							System.out.println("a="+a+",b="+b+",c="+c);
							cnt++;
						}// end if
					}
				}//end for  c
			}//end for b
		}//end for a

		System.out.println("피타고라스 정리를 만족하는 삼각형의 수는 " + cnt);
	}
}
