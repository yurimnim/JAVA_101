package com.bit.exam05;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCount3 {
	//src: hello java hello korea
	//des: hello 
    public static int check(String src, String des)
    {
        String tmp = src.replace(" ","");
      //src: hellojavahellokorea
        
        int len = des.length();
        int cnt=0;

        for(int i=0; i<tmp.length(); i++)
        {
            String tmp2 = ""; // = null
            // ���� ó��
            if(i+len > tmp.length())
            {
                break;
            }//���ڼ��� ���ϴ� ���ڼ� ���� ������� stop

            tmp2 = tmp.substring(i,i+len);

            if(tmp2.equals(des))
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static void print(String data, int cnt)
    {
        System.out.println(data + " = " + cnt + "��");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp;

        ArrayList<String> list = new ArrayList<String>();   // ���� �Է� ���ڿ��� ���� ArrayList
        ArrayList<String> list2 = new ArrayList<String>();   // �ߺ��� ������ ���ڿ��� ���� ArrayList
        
        //tmp "hello java hello Korea"
        //hello java korea

        System.out.print("���ڿ��� �Է��� �ּ��� ==> ");
        tmp = sc.nextLine();
        
        String[] splitStr = tmp.split(" ");
        
        for(int i = 0; i<splitStr.length; i++){
            list.add(splitStr[i]);
        }

        for (int j = 0; j < list.size(); j++) {
            if (!list2.contains(list.get(j))) {
            	list2.add(list.get(j)); 
            }
        }
        
        list2.remove("");

        System.out.println("�Է��� ���ڿ��� �ܾ�� : " + list);
        System.out.println("������ ���� ��� �ܾ�� : " + list2);
        System.out.println("���� �Է��� �ܾ��� ��  " + list.size());
        System.out.println("�ߺ��� ������ �ܾ��� ��  " + list2.size());
        for (int j = 0; j < list2.size(); j++) {
            String comp = list2.get(j); // hello
            print(comp,check(tmp, comp)); //hello, 2
        }
    }
}