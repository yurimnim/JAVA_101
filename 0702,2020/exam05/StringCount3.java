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
            // 예외 처리
            if(i+len > tmp.length())
            {
                break;
            }//글자수가 비교하는 글자수 보다 길어지면 stop

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
        System.out.println(data + " = " + cnt + "개");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp;

        ArrayList<String> list = new ArrayList<String>();   // 최초 입력 문자열을 넣을 ArrayList
        ArrayList<String> list2 = new ArrayList<String>();   // 중복을 제거한 문자열을 넣을 ArrayList
        
        //tmp "hello java hello Korea"
        //hello java korea

        System.out.print("문자열을 입력해 주세요 ==> ");
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

        System.out.println("입력한 문자열의 단어들 : " + list);
        System.out.println("갯수를 구할 대상 단어들 : " + list2);
        System.out.println("원래 입력한 단어의 수  " + list.size());
        System.out.println("중복을 제거한 단어의 수  " + list2.size());
        for (int j = 0; j < list2.size(); j++) {
            String comp = list2.get(j); // hello
            print(comp,check(tmp, comp)); //hello, 2
        }
    }
}