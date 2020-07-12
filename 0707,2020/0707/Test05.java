class NotFoundException extends Exception
{
	public NotFoundException(String msg){
		super(msg);
	}
}

class SearchArray
{
	public void search(int arr[], int value) throws NotFoundException {
		int i=0;
		for(i=0;i< arr.length;i++){
			if(arr[i] == value){
				System.out.println("ã�����ϴ� �����ʹ� �迭�� " + i + "��°�� �ֽ��ϴ�.");
				break;
			}
		}

		if(i == arr.length){
			throw new NotFoundException("ã���� �ϴ� ������ " + value+ "��(��) �迭�� �����ϴ�.");
		}
	}
}


class Test05 
{
	public static void main(String[] args) 
	{
		try{
			int []arr = {10,20,30,40,50};
			SearchArray sa = new SearchArray();
			sa.search(arr, 90);
		}catch(NotFoundException e){
			System.out.println("���ܹ߻�:" + e.getMessage());
		}
	}
}