import java.util.ArrayList;

class  ArrayListTest3{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("����ȣ");
		list.add("�����");
		list.add("������");
		list.add("�۽ÿ�");
		list.add("����");
		
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
