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
        System.out.println("개봉예정영화");
        System.out.println(title + " " + " 감독 " + director + " 제작사 " + production);
    }

    //constructor
     public Movie() {
        title = "둘리의 대모험";
        director = "고길동";
        production = "영화사 또치";
	 }
 	 
	 public Movie (String t, String d, String p) {
        title = t;
        director = d;
        production = p;
    }
  }


class MovieTest {
    public static void main(String[] args) {
        Movie jaws = new Movie("죠스", "스티븐스필버그", "영화사 죠스");
        Movie jaws2 = new Movie();
        Movie dooly = new Movie();

        jaws2.setDirector("스티븐스필버그");
        jaws2.setTitle("죠스 2");
        jaws2.setProduction("영화사 죠스");
        
		System.out.println();
        System.out.println("영화 " + dooly.getTitle());
        System.out.println("감독 " + dooly.getDirector());
        System.out.println("제작 " + dooly.getProduction());
        System.out.println("절찬리 상영중!");
        
        System.out.println("================");
        jaws.getMovie();
        System.out.println("================");
        jaws2.getMovie();

    }
}