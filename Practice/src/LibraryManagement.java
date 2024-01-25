import java.util.*;

public class LibraryManagement {

	public static void main(String[] args) {
		Books b1= new Books("vd","vvv");
		Books b2= new Books("dd","vvv");
		Books b3= new Books("cd","vvv");
		Books b4= new Books("vd","vvv");
		
		
		Library l=new Library();
		l.addBook(b1);
		l.addBook(b2);
		l.addBook(b3);
		l.addBook(b4);
		
		System.out.println("Books present in Library");
		for(Books b : l.getBooks()){
			System.out.println(b.getBookName()+" "+b.getBookAuthor());
		}
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		l.checkBooks(s);
		
		//l.removeBook
	}

}
