import java.util.*;

public class BookDatabase {
	private Map<String, Book> Data =new HashMap<>();

	public Book searchByTitle(String title) {
		return this.Data.get(title);
	}

	public Set<Book> searchByAuthor(String author) {
		Set<Book> tempSet = new HashSet<Book>();
		for (Map.Entry<String, Book> entry : Data.entrySet()) {
			if (entry.getValue().getAuthorset().contains(author)) {
				tempSet.add(entry.getValue());
			}
		}
		return tempSet;
	}

	public Set<Book> searchP(String publisher) {
		Set<Book> temp = new HashSet<>();
		for (Map.Entry<String, Book> entry : Data.entrySet()) {
			if (entry.getValue().getPublisher().equals(publisher)) {
				temp.add(entry.getValue());
			}
		}
		return temp;
	}

	public Set<Book> publishedBefore(int year) {
		Set<Book> temp = new HashSet<>();
		for (Map.Entry<String, Book> entry : Data.entrySet()) {
			if (entry.getValue().getyearOfPublication() < year) {
				temp.add(entry.getValue());
			}
		}
		return temp;
	}

	public void remove(String title) {
		if (this.Data.containsKey(title)) {
			this.Data.remove(title);
		}
	}

	public void add(Book add) {
		if (!(this.Data.containsKey(add.getTitle()))) {
			this.Data.put(add.getTitle(),add);
		
		}
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String s : Data.keySet()) {
			sb.append(Data.get(s));
		}
		return sb.toString();
	}

}

