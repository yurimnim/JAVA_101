class Book {
	private String title;
	private String author;

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

class BookTest {
	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("Great Java");
		b.setAuthor("bob");
		
		System.out.println("도서명:::"+ b.getTitle());
		System.out.println("작가:::"+ b.getAuthor());

	}
}
