package com.bit.exam03;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) {
		try {
		InetAddress addr =InetAddress.getByName("www.google.com");
		System.out.println(addr);
		}catch(Exception e) {
			
		}
	}

}
