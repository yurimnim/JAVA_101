package com.bit.exam06;

public class RecursionTest {
	//������ ���� n�� ���޹޾� 1���� n������ ���� �����Ͽ� ��ȯ�ϴ� �޼ҵ� ���� 
	//���ȣ���̿�
	public static int getSum(int n) {
		if(n == 1)
			return 1;
		return n + getSum(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("���: " + getSum(5));	
	}
}
