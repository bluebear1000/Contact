import java.util.*;

public class Book {
	private String title;
	private String publisher;
	private int yearOfPublication;
	private String[] authors;
	private Set<String> authorset;
	private int numAuthors;

	Book(String title, String publisher, int yearOfPublication, String[] authors, int numAuthors) {
		this.title = title;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.numAuthors = numAuthors;
		this.authorset = new HashSet<>();
		this.numAuthors = numAuthors;
		this.authors = authors;
	}

	public  String getTitle() {
		return this.title;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public int getyearOfPublication() {
		return this.yearOfPublication;
	}

	public Set<String> getAuthorset() {
		return this.authorset;
	}
	
	public int numAuthors() {
		return this.numAuthors;
	}
	
	public int compareTo(Book another) {
		return this.title.compareTo(another.getTitle());
	}
	public boolean equals(Object obj) {
		return this.title.equals(((Book) obj).getTitle());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
			sb.append("Title: " + this.title);
			sb.append("Authors: ");
			for (int i = 0; i < authors.length; i++) {
				sb.append(i < authors.length-1 ? authors[i] : "\n");
			}
			
			sb.append("Publisher: " + this.publisher );
			sb.append("Year: " + this.yearOfPublication);
			
			return sb.toString();
			
		}
	}

