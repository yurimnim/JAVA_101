import java.util.ArrayList;

class ArrayListRemove {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("���");
		list.add("����");
		list.add("����");
		
		for (int i=0; i<list.size(); i++ ){ //�ݺ��Ǵ� ����� �پ���� - ����Ʈ�� ���� ������ 
			list.remove(i);
		}
		
		System.out.println(list);
	}
}
