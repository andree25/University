
public class Main {

	public static void main(String[] args) {

//		Author aAuthor = new Author("Gulugu", "bhfbr@dhbhb.com", 'm');
//		System.out.println(aAuthor);
//
//		Page aPage = new Page(34, 125, "hefbjeb");
//		System.out.println(aPage);
//
//		Book aBook = new Book("lalalalala", aAuthor, 19.95, 99);
//		System.out.println(aBook);
//		
//		
//
//		Author bAuthor = new Author("Maimutel", "tatata@yoyoyo.com", 'f');
//		System.out.println(bAuthor);
//
//		Page bPage = new Page(35, 235, "hbfhb");
//
//		System.out.println(bPage);
//
//		Book bBook = new Book("Piuiupiioei", bAuthor, 65.21, 74);
//		System.out.println(bBook);

		Author[] aAuthor = new Author[] { new Author("Maimutel", "tatata@yoyoyo.com", 'm'),
				new Author("Gulugu", "bhfbr@dhbhb.com", 'm') };
		Book aBook = new Book("lalalalala", aAuthor, 19.95, 99);
		System.out.println(aBook);

		Author[] bAuthor = new Author[] { new Author("ffefkek", "jfbjwfb@jwhhw.com", 'm'),
				new Author("dfjbhe", "jhfjhfhj@jedw.com", 'm') };
		Book bBook = new Book("ksksks", bAuthor, 87.3, 100);
		System.out.println(bBook);
	}

}
