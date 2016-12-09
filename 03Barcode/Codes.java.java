public class Codes implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    public Barcode(String zip){
	_zip = zip;
	_checkDigit = 0;
	if (zip.length() != 5){
	    throw new IllegalArgumentException ("The input is not the right length.");
	}
	String formattedZip = "";
	for (int i = 0; i < 5; i++){
	    System.out.println(_zip.charAt(i));
	    // System.out.println(_zip.charAt(i) == '0');
	    if(_zip.charAt(i) == '0'){
		formattedZip += "||:::";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '1'){
		formattedZip += ":::||";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '2'){
		formattedZip += "::|:|";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '3'){
		formattedZip += "::||:";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '4'){
		formattedZip += ":|::|";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '5'){
		formattedZip += ":|:|:";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '6'){
		formattedZip += ":||::";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '7'){
		formattedZip += "|:::|";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '8'){
		formattedZip += "|::|:";
		System.out.println(formattedZip + " i:" + i);
	    }
	    if(_zip.charAt(i) == '9'){
		formattedZip += "|:|::";
		System.out.println(formattedZip + " i:" + i);
	    }
	    /**if(_zip.charAt(i) != '0' || _zip.charAt(i) != '1' || _zip.charAt(i) != '2' || _zip.charAt(i) != '3' || _zip.charAt(i) != '4' || _zip.charAt(i) != '5' || _zip.charAt(i) != '6' || _zip.charAt(i) != '7' || _zip.charAt(i) != '8' || _zip.charAt(i) != '9') {
		System.out.println(formattedZip  + " i:" + i);
		throw new IllegalArgumentException ("The input has non-digits.");
		}*/
	    //fix the exception for if anything in _zip is a non-digit (its simple but eluding me rn, has to do w. if vs ifelse vs else type stuff)
	}
	//System.out.println("ZIP:    " + _zip);
	System.out.println("Relics of feudalism" + Integer.valueOf(_zip.charAt(0)));
	System.out.println("Relics of feudalism" + Integer.valueOf(_zip.charAt(1)));
	System.out.println("Relics of feudalism" + Integer.valueOf(_zip.charAt(2)));
	System.out.println("Relics of feudalism" + Integer.valueOf(_zip.charAt(3)));
	System.out.println("Relics of feudalism" + Integer.valueOf(_zip.charAt(4)));
		    
	_checkDigit = ((int)(_zip.charAt(0)) - 48*5 + (int)(_zip.charAt(1)) + (int)(_zip.charAt(2)) + (int)(_zip.charAt(3)) + (int)(_zip.charAt(4)))% 10 ;
	_zip = formattedZip;
    }
    //public Barcode clone(){}
    //private int checkSum(){}
    public String toString(){
	System.out.println("toString: this is unfinished, bc _checkDigit is an int rather than the weird symbols: fix this!!");
	return "|" + _zip + _checkDigit + "|";
    }
    public int compareTo(Barcode other){
	System.out.println("compareTo: this is unfinished!!");
	//for (int i = other.length(?))
	if (other.charAt(
    }
    //replace digits with crazy symbols
    //checkSum is a number or numbers used to validate other info. and i think checkdigit is just a variable for this???
    public static void main(String[]args){
	Barcode a = new Barcode("08451");
	System.out.println(a.toString());
	Barcode b = new Barcode ("12345");
	System.out.println(b.toString());
    }
      

}
