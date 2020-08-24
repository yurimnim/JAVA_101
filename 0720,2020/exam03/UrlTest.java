package com.bit.exam03;

import java.io.InputStream;
import java.net.URL;

public class UrlTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.hanbit.co.kr/store/books/look.php?p_code=B3745711486");
			InputStream is = url.openStream();
			int ch;
			while((ch = is.read())!=-1) {
				System.out.print((char)ch);
			}
			is.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
