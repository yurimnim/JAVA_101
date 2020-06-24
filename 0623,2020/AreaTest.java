class AreaTest 
{
	public static void main(String[] args) 
	{
		if(args.length < 2){
			System.out.println("도형의 종류와 입력데이터를 확인하세요!");
			return;
		}
		String type = args[0];
		double area = 0;
		double width, height, radius;
		switch(type){
			case "R":
				if(args.length != 3){
					System.out.println("입력값을 확인하세요");
					return;
				}
				width = Double.parseDouble(args[1]);
				height = Double.parseDouble(args[2]);
				area = width * height;
				break;
			case "T":
				if(args.length != 3){
					System.out.println("입력값을 확인하세요");
					return;
				}
				width = Double.parseDouble(args[1]);
				height = Double.parseDouble(args[2]);
				area = width * height/2;
				break;
			case "C":
				if(args.length != 2){
					System.out.println("입력값을 확인하세요");
					return;
				}
				radius = Double.parseDouble(args[1]);
				area = 3.14 * radius * radius;
				break;
		}


		System.out.println("도형의 면적:" + area);
	}
}
