class Book {
	private String title;
	private String author;

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

class BookTest {
	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("Great Java");
		b.setAuthor("bob");
		
		System.out.println("������:::"+ b.getTitle());
		System.out.println("�۰�:::"+ b.getAuthor());

	}
}
