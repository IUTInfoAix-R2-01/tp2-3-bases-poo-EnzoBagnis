package exercice12;


public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Construct an author instance
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(authors[0]);  // Author's toString()
		authors[1] = new Author("Eli Zabeth II", "thequeen@gamil.com", 'f');
		System.out.println(authors[1]);
		
		Book dummyBook = new Book("Java for dummy", authors , 19.95, 99); 

		// Test Getters and Setters
		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		for (Author author : dummyBook.getAuthor()) {
		    System.out.println(author);  // Affichera chaque auteur via son toString()
		}

		// Use an anonymous instance of Author to construct a Book instance
		Book anotherBook = new Book("more Java", 
			      new Author[]{ new Author("Paul Tan", "paul@somewhere.com", 'm') }, 29.95);
	}

}
