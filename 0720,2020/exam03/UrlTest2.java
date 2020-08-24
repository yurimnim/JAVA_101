package com.bit.exam03;

import java.io.InputStream;
import java.net.URL;

public class UrlTest2 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.hanbit.co.kr/store/books/look.php?p_code=B3745711486");
			InputStream is = url.openStream();
			
			byte[]data = is.readAllBytes();
			String str = new String(data, "utf-8");
			System.out.println(str);
			
			is.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
