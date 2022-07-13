import java.util.Arrays;

class Book {

	private String name;
	private Author[] authors = new Author[2];
//	authors[0] = new Author("gigel", "sbfhb@jshbcsdb.com", "m");
//	authors[1] = new Author("mimi", "kebfh@jhbbjnef.com", "m");
	private Page page;
	private double price;
	private int qty = 0;

	public Book(String name, Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public Book(String name, Author[] authors, double price, int qty, Page page) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
		this.page = page;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;

	}

	public Page getPaige() {
		return page;
	}

//	public void setPaige(Page paige) {
//		this.page = paige;
//	}

	public Author[] getAuthorNames() {
		return authors;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", page=" + page + ", price=" + price
				+ ", qty=" + qty + "]";
	}

//	@Override
//	public String toString() {
//		return "Book [name=" + name + ", author=" + authors + ", price=" + price + ", qty=" + qty + ", page= " + page
//				+ "]";
//	}
	
	

}
