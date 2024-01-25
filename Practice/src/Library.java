import java.util.ArrayList;

public class Library {
	private ArrayList<Books> books;
	
	public Library(){
		books = new ArrayList<Books>();
		
	}
	
	public void addBook(Books b) {
		books.add(b);
	}
	
	public void removeBook(Books b) {
		books.remove(b);
	}
	
	public ArrayList<Books> getBooks(){
		return books;
	}
	
	public void checkBooks(String s) {
		//if()
	}
	

}