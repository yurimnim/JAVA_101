package com.bit.exam06;

public class CallByReferenceArray {
	//������ �迭�� �Ű�����,�迭�� ��Ҹ� ��� 1������
	public static void plusOne(int []arr) {
		for(int i = 0; i <arr.length;i++) {
			arr[i] = arr[i]+1;
		}
	}
	
	public static void main(String[] args) {
		int []ages  = {36,28,26,30,27};
		plusOne(ages);
		for(int i = 0; i <ages.length;i++) {
			System.out.print(ages[i] + " ");
		}
	}
}
