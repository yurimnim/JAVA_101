package com.bit.exam08;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<String, Integer>();//순서가 유지되지 않는다.

//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();//순서가 유지된다.
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();//key의 순서에 따라 정리가 된다.
		
		map.put("고길동", 22);
		map.put("김순신", 30);
		map.put("강유신", 25);
		System.out.println(map);
		
	
	}

}
