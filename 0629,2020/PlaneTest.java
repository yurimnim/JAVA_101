class Plane {
	private String company;
	private String model;
	private int passangerNo;
	
	//������ setter
	public void setCompany(String c) {
		company = c;
	}

	public void setModel (String m) {
		model = m;
	}
	
	public void setPassangerNo(int s) {
		passangerNo = s;
	}

	//������ 
	public String getCompany() {
		return company;
	}
	
	
	public String getModel() {
		return model;
	}

	public int getPassangerNo() {
		return passangerNo;
	}
}

class PlaneTest {
	public static void main(String[] args) {
		Plane p;
		p = new Plane();

		p.setCompany("Airbus");
	}
}
