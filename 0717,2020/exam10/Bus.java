package com.bit.exam10;

public class Bus {
	private int seats = 10;
	
	public synchronized void Reservation(String name, int cnt) {
		System.out.println(name + " ��(��) ������.");
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {

		}
		
		System.out.println("������ �¼���: " + seats + "��û�¼���: "+ cnt );
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {

		}		
		if(seats >= cnt) {		
			seats = seats - cnt;
			System.out.println(cnt + " �¼��� ����Ǿ���");
		} else {			
			System.out.println("�¼������� �Ұ����մϴ�.");		
		}
		
		try {
			Thread.sleep(300);
		} catch (Exception e) {

		}
		System.out.println(name + " ��(��) �����ϴ�.");
		System.out.println("==========================================================");
		try {
			Thread.sleep(300);
		} catch (Exception e) {

		}
	}
	
}
