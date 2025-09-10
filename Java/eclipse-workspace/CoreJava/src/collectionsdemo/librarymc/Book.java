package collectionsdemo.librarymc;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :2:13:04 PM
 *project : projCoreJava
 */

public class Book {
	
	private int id;
    private String title;
    private String author;
    private int year;
    private String category;
    
	public Book(int id, String title, String author, int year, String category) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", category="
				+ category + "]";
	}
	
	
    
    
}
