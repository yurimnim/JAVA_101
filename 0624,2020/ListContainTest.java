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

class ListContainTest 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(new Data(3,4));
		
		boolean f = list.contains(new Data(2,5) );
		System.out.println(f);

	}
}
