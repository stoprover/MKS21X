public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
    private boolean DEBUG = true;
    public CirculatingBook(String author, String title, String ISBN, String callNumber){
	super(author, title, ISBN, callNumber);
	currentHolderSet("");
	dueDateSet("");
    }
    public void currentHolderSet(String newCH){
	currentHolder = newCH;
    }
    public String currentHolderGet(){
	return this.currentHolder;
    }
    public void dueDateSet(String newDD){
	dueDate = newDD;
    }
    public String dueDateGet(){
	return this.dueDate;
    }
    public void checkout(String patron, String due){
	currentHolderSet(patron);
	dueDateSet(due);
    }
    public void returned(){
	currentHolderSet("");
	dueDateSet("");
    }
    public String circulationStatus(){
	if (currentHolderGet().equals("") && dueDateGet().equals("")){
	    return "book available on shelves";
	}
	else{
	    return currentHolderGet() + dueDateGet();
	}
    }
    public String toString(){
	return super.toString() + "\nCurrent Holder: " + currentHolderGet() + "\nDue Date: " + dueDateGet();
    }
    /**public static void main (String[]args){
	CirculatingBook cb = new CirculatingBook("Mach", "Prince", "top24", "97");
	System.out.println(cb.toString());
	cb.checkout("John", "now");
	System.out.println(cb.circulationStatus());
	cb.returned();
	System.out.println(cb.circulationStatus());
	}*/
}
