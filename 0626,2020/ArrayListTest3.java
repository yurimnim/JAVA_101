import java.util.ArrayList;

class  ArrayListTest3{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("정재호");
		list.add("김미진");
		list.add("김지현");
		list.add("송시욱");
		list.add("김길모");
		
		for (int i = 0; i < list.size(); i++ ){
			System.out.println(list.get(i));
		}
		

		/*
		for ( String name:list ){
			System.out.println(name);
		}
		*/
	//	System.out.println(list);
	}
}
