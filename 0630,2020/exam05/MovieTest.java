package com.bit.exam05;

class Movie {
    private String title; 
    private String director;
    private String production;


    //setter 
    public void setTitle(String st) {
       title = st;
    }

    public void setDirector(String sd) {
        director = sd;
    }

    public void setProduction(String sp) {
        production =sp;
    }

    //getter0
    public String getTitle() {
        return title;
    } 

    public String getDirector() {
        return director;
    }

    public String getProduction() {
        return production;
    }

    public void getMovie() {
		System.out.println();
        System.out.println("����������ȭ");
        System.out.println(title + " " + " ���� " + director + " ���ۻ� " + production);
    }

    //constructor
     public Movie() {
        title = "�Ѹ��� �����";
        director = "��浿";
        production = "��ȭ�� ��ġ";
	 }
 	 
	 public Movie (String t, String d, String p) {
        title = t;
        director = d;
        production = p;
    }
  }


class MovieTest {
    public static void main(String[] args) {
        Movie jaws = new Movie("�ҽ�", "��Ƽ�콺�ʹ���", "��ȭ�� �ҽ�");
        Movie jaws2 = new Movie();
        Movie dooly = new Movie();

        jaws2.setDirector("��Ƽ�콺�ʹ���");
        jaws2.setTitle("�ҽ� 2");
        jaws2.setProduction("��ȭ�� �ҽ�");
        
		System.out.println();
        System.out.println("��ȭ " + dooly.getTitle());
        System.out.println("���� " + dooly.getDirector());
        System.out.println("���� " + dooly.getProduction());
        System.out.println("������ ����!");
        
        System.out.println("================");
        jaws.getMovie();
        System.out.println("================");
        jaws2.getMovie();

    }
}