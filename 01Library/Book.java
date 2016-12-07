public class Book {
    private String author;
    private String title;
    private String ISBN;
    public Book(){
	authorSet("");
	titleSet("");
	ISBNSet("");
    }
    public Book (String auth, String titl, String ISB){
	authorSet(auth);
	titleSet(titl);
	ISBNSet(ISB);
    }
    public void authorSet(String newAuth){
	author = newAuth;
    }
    public String authorGet(){
	return this.author;
    }
    public void titleSet(String newTitle){
	title = newTitle;
    }
    public String titleGet(){
	return this.title;
    }
    public void ISBNSet(String newISBN){
	ISBN = newISBN;
    }
    public String ISBNGet(){
	return this.ISBN;
    }
    public String toString (){
	return "Title: " + titleGet() + "\nAuthor: " + authorGet() + "\nISBN: " + ISBNGet() ;
    }
    /**public static void main (String[]args){
	Book a = new Book();
	Book b = new Book("Niccolo Machiavelli", "The Prince", "potato24");
	System.out.println(a.toString());
	System.out.println(b.toString());
	}*/
}
	
