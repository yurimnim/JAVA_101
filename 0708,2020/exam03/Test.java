package com.bit.exam03;

public class Test {
	public static double getAverage(int []arr) {
		double avg = 0;
		try {		
			int sum = 0;
			for(int i = 0; i<arr.length; i++) {
				sum += arr[i];
			}
			avg = sum / arr.length;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();;
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		return avg;
	}
	
	public static void main(String[] args) {
		String data = "100,100,90,80,70,100,70,50,100,90";
		int []score;
		String []arr = data.split(",");
		score = new int[arr.length];	
		for(int i=0; i<score.length;i++) {
			score[i] = Integer.parseInt(arr[i]);
		}
		System.out.println("Æò±ÕÁ¡¼ö "+ getAverage(score));
	}
}
