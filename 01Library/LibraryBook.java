public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    public LibraryBook(String author, String title, String ISBN, String call){
	super(author, title, ISBN);
	callSet(call);
    }
    public void callSet( String newCall){
	callNumber = newCall;
    }
    public String callGet(){
	return this.callNumber;
    }
    public int compareTo(LibraryBook lb){
	if (callGet().compareTo(lb.callGet()) > 0){
	    return 1;
	}
	else if (callGet().compareTo(lb.callGet()) < 0){
	    return -1;
	}
	else{
	    return 0;
	}
    }
    public abstract void checkout(String patron, String due);
    public abstract void returned();
    public abstract String circulationStatus();
    public String toString(){
	return super.toString() + "\nCall number: " + callGet() + "\nCirculation Status: " + circulationStatus();
    }
}

	
