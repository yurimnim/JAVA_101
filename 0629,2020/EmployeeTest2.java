class Employee {
	private String name;
	private String tel;
	private int salary;

	//setter
	public void setName(String n) {
		name = n;
	}

	public void setTel(String t) {
		tel = t;
	}
	
	public void setSalary(int s) {
		salary = s;
	}
	//getter

	public String getName() {
		return name;
}	
	public String getTel() {
		return tel;
}	
	public int getSalary() {
		return salary;
}	

}

class EmployeeTest2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("�Ѹ�");
		e.setTel("119-112");
		e.setSalary(10);
		
		System.out.println("�̸�:::" + e.getName());
		System.out.println("��ȭ��ȣ:::" + e.getTel());
		System.out.println("����:::" + e.getSalary());
	}
}
