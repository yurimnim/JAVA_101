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
		e.setName("둘리");
		e.setTel("119-112");
		e.setSalary(10);
		
		System.out.println("이름:::" + e.getName());
		System.out.println("전화번호:::" + e.getTel());
		System.out.println("연봉:::" + e.getSalary());
	}
}
