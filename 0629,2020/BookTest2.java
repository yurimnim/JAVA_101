class Book {
	private String title;
	private String author;

	//������
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	//setter ������
	public void setTitle(String t) {
		title = t;
	}

	public void setAuthor(String a) {
		author = a;
	}

	//getter ������
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
		
		System.out.println("������:::"+ b.getTitle());
		System.out.println("�۰�:::"+ b.getAuthor());

	}
}
