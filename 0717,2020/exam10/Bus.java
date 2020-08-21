package com.bit.exam10;

public class Bus {
	private int seats = 10;
	
	public synchronized void Reservation(String name, int cnt) {
		System.out.println(name + " 이(가) 들어왔음.");
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {

		}
		
		System.out.println("가능한 좌석수: " + seats + "요청좌석수: "+ cnt );
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {

		}		
		if(seats >= cnt) {		
			seats = seats - cnt;
			System.out.println(cnt + " 좌석이 예약되었음");
		} else {			
			System.out.println("좌석예약이 불가능합니다.");		
		}
		
		try {
			Thread.sleep(300);
		} catch (Exception e) {

		}
		System.out.println(name + " 이(가) 나갑니다.");
		System.out.println("==========================================================");
		try {
			Thread.sleep(300);
		} catch (Exception e) {

		}
	}
	
}
