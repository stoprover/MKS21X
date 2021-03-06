public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
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
	System.out.println("checkout: Fix this entire method");
    }
    public void returned(){
	System.out.println("returned: Fix this entire method");
    }
    public String circulationStatus(){
	return "circulationStatus: Fix this entire method";
    }
    public String toString(){
	return super.toString() + "\nCurrent Holder: " + currentHolderGet() + "\nDue Date: " + dueDateGet();
    }
    public static void main (String[]args){
	CirculatingBook cb = new CirculatingBook("Mach", "Prince", "top24", "97");
	System.out.println(cb.toString());
	cb.checkout("John", "now");
	cb.returned();
	System.out.println(cb.circulationStatus());
    }
}
