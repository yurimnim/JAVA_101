class Employee{
	private String name;
	private String moblieNo;
	private double	annualIncome;

	//setter
	public void setName(String n) {
		name = n;
	}

	public void setMoblieNo(String m) {
		moblieNo = m;
	}

	public void setAnnualIncome(double a) {
		annualIncome = a;
	}

	//getter
	public String getName() {
		return name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee dooly = new Employee();

		dooly.setName("둘리");
		dooly.setMoblieNo("119");
		dooly.setAnnualIncome(20);

		System.out.println("직원이름:::" + dooly.getName());  
		System.out.println("전화번호:::" + dooly.getMoblieNo()); 
		System.out.println(" 연봉:::" + dooly.getAnnualIncome());
	
	}
}
