public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    public Barcode(String zip){
	_zip = zip;
	//_checkDigit = 
	if (zip.length() != 5){
	    //throw new IllegalArgumentException ("The input is not the right length.")
	    //this should be an official exception, but just for now, print stuff
	    System.out.println("zip is too long!!!");
	}
	//replace crazy symbols with number	 
    //checkSum is a number or numbers used to validate other info. and i think checkdigit is just a variable for this???

}
