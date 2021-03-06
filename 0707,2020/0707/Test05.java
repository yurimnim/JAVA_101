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
				System.out.println("찾고자하는 데이터는 배열의 " + i + "번째에 있습니다.");
				break;
			}
		}

		if(i == arr.length){
			throw new NotFoundException("찾고자 하는 데이터 " + value+ "가(이) 배열에 없습니다.");
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
			System.out.println("예외발생:" + e.getMessage());
		}
	}
}
