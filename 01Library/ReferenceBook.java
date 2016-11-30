public class ReferenceBook extends LibraryBook{
    private String collection;
    public ReferenceBook(String author, String title, String ISBN, String callNumber, String coll){
	super(author, title, ISBN, callNumber);
	collectionSet(coll);
    }
    public void collectionSet(String newCol){
	collection = newCol;
    }
    public String collectionGet(){
	return this.collection;
    }
    public void checkout(String patron, String due){
	System.out.println("cannot check out a reference book" + " That being said, this needs to be an exception rather than a simple print statement, so fix it.");
    }
    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible" + "That being said, this needs to be an exception rather than a simple print statement, so fix it.");
    }
    public String circulationStatus(){
	return "non-circulating reference book";
    }
    public String toString(){
	return super.toString() + "\nCollection: " + collectionGet();
    }
    public static void main (String[]args){
	ReferenceBook rb = new ReferenceBook ("Mach", "Prince", "top24", "97", "crazy");
	System.out.println(rb.toString());
        rb.checkout("John", "now");
        rb.returned();
	System.out.println(rb.circulationStatus());
    }
}
