class  DimenTest{
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("������ ������ �Էµ����͸� Ȯ���ϼ���.");
			return; 
		}	
		String type = args[0];
		double result = 0;
		double width, height, radius;
		switch (type) {
				case "R": 
					if (args.length!= 3){
						System.out.println("�Է°��� Ȯ���ϼ���.");
						 return;
					}
					width = Double.parseDouble(args[1]);
					height = Double.parseDouble(args[2]);
					result = width * height;
					break;
				case "T": 
						if (args.length != 3){
						System.out.println("�Է°��� Ȯ���ϼ���.");
						 return;
					}
					width = Double.parseDouble(args[1]);
					height = Double.parseDouble(args[2]);
					result = width * height/2;
					break;
				case "C":
					radius = Double.parseDouble(args[1]);
					result = radius *radius * 3.14;
					break;			
		}
			System.out.println("���� : " + result);
	}
}
