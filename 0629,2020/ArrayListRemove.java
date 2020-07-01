import java.util.ArrayList;

class ArrayListRemove {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("사과");
		list.add("수박");
		list.add("포도");
		
		for (int i=0; i<list.size(); i++ ){ //반복되는 사이즈가 줄어들음 - 리스트를 전부 못지움 
			list.remove(i);
		}
		
		System.out.println(list);
	}
}
