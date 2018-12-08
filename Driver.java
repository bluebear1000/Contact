import java.util.*;

public class Driver {
	public static void main(String[] args) {
		ArrayList<String> authors1 = new ArrayList<String>();
		authors1.add("G. Washington");
		authors1.add("J. Adams");

		ArrayList<String> authors2 = new ArrayList<String>();
		authors2.add("S. John");
		authors2.add("H. Homer");
		authors2.add("H. Taft");

		ArrayList<String> authors3 = new ArrayList<String>();
		authors3.add("A. Lincoln");
		authors3.add("W. Wilson");

		ArrayList<String> authors4 = new ArrayList<String>();
		authors4.add("R. Reagan");
		authors4.add("J. Polk");

		ArrayList<String> authors5 = new ArrayList<String>();
		authors5.add("F. Roosevelt");

		ArrayList<String> authors6 = new ArrayList<String>();
		authors6.add("J. Kennedy");

		Book book1 = new Book("Data Structures With Java", "Seth Rogen", 2002, authors1.toArray(new String[0]), authors1.size());
		Book book2 = new Book("American History", "McGraw Hill", 2005, authors2.toArray(new String[0]), authors2.size());
		Book book3 = new Book("Vampire Slayer", "Seth Rogen", 2013, authors3.toArray(new String[0]), authors3.size());
		Book book4 = new Book("Ford", "Penguin", 1999, authors4.toArray(new String[0] ), authors4.size()) ;
		Book book5 = new Book("Stick", "Trolli and Sons", 1995, authors5.toArray(new String[0]), authors5.size());
		Book book6 = new Book("Airplane", "Rock Roll", 2010, authors6.toArray(new String[0]), authors6.size());

		//adding books to database
		BookDatabase database = new BookDatabase();
		System.out.print("Adding books to database");
		System.out.print("\n");
		System.out.print("\n");
		database.add(book1);
		database.add(book2);
		database.add(book3);
		database.add(book4);
		database.add(book5);
		database.add(book6);

		// printing database
		System.out.print("\nCurrent database");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(database);

		System.out.print("Comparing books alphabetically");
		System.out.print("\n");
		int compare = book1.compareTo(book2);
		if (compare < 0) {
			System.out.print(book1.getTitle());
			System.out.print(" comes before ");
			System.out.print(book2.getTitle());
			System.out.print("\n");
			System.out.print("\n");
		} else {
			System.out.print(book2.getTitle());
			System.out.print(" comes before ");
			System.out.print(book1.getTitle());
			System.out.print("\n");
			System.out.print("\n");
		}

		System.out.print("Comparing books to see if equal");
		System.out.print("\n");
		if (book1 == book2) {
			System.out.print(book1.getTitle());
			System.out.print(" both has the same title");
			System.out.print("\n");
			System.out.print("\n");
		} else {
			System.out.print(book2.getTitle());
			System.out.print(" and ");
			System.out.print(book1.getTitle());
			System.out.print(" have different titles");
			System.out.print("\n");
			System.out.print("\n");
		}
		System.out.print("Looking for book with title 'Stick'");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(database.searchByTitle("Stick"));

		System.out.print("Finding for book written by G. Washington");
		System.out.print("\n");
		System.out.print("\n");
		Set<Book> booksTest = database.searchP("G. Washington");
		if (!booksTest.isEmpty()) {
			for (Iterator<Book> it = booksTest.iterator(); it.hasNext();) {
				System.out.print((it));
			}
		} else {
			System.out.print("No books written by requested author.");
			System.out.print("\n");
		}

		System.out.print("Finding books published before 2003 ");
		System.out.print("\n");
		System.out.print("\n");
		Set<Book> booksBefore = database.publishedBefore(2003);
		for (Iterator<Book> itYear = booksBefore.iterator(); itYear.hasNext();) {
			System.out.print((itYear));
		}
		System.out.print("Finding books published by Seth Rogen");
		System.out.print("\n");
		System.out.print("\n");
		Set<Book> booksPub = database.searchP("Seth Rogen");
		if (!booksPub.isEmpty()) {
			for (Iterator<Book> itPub = booksPub.iterator(); itPub.hasNext();) {
				System.out.print((itPub));
			}
		} else {
			System.out.print("No books written by requested publisher.");
			System.out.print("\n");
			System.out.print("\n");
		}

		System.out.print("Removing Data Structures With C++ Using STL ");
		System.out.print("\n");
		System.out.print("\n");
		database.remove("Data Structures With C++ Using STL");

	}

}
