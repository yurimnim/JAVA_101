class Book {
	private String title;
	private String author;

	//생성자
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	//setter 설정자
	public void setTitle(String t) {
		title = t;
	}

	public void setAuthor(String a) {
		author = a;
	}

	//getter 접근자
	 public String getTitle() {
		 return title;
	 }

	 public String getAuthor() {
		 return author;
	 }
}

class BookTest2 {
	public static void main(String[] args) {
		Book b = new Book("Great Java" , "Dooly");
		
		System.out.println("도서명:::"+ b.getTitle());
		System.out.println("작가:::"+ b.getAuthor());

	}
}
