public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    public Barcode (String zip){
	if (zip.length() != 5){
	    throw new IllegalArgumentException("The input is the wrong length.");
	}
	if ((int)(zip.charAt(0)) < 48 || (int)(zip.charAt(0)) > 57 || (int)(zip.charAt(1)) < 48 || (int)(zip.charAt(1)) > 57 || (int)(zip.charAt(2)) < 48 || (int)(zip.charAt(2)) > 57 || (int)(zip.charAt(3)) < 48 || (int)(zip.charAt(3)) > 57 || (int)(zip.charAt(4)) < 48 || (int)(zip.charAt(4)) > 57){
	    throw new IllegalArgumentException("The input must not contain non-digits.");
	}
	_zip = zip;
	_checkDigit = checkSum(zip);
    }
    private static int checkSum(String zipper){
	return ((int)(zipper.charAt(0)) + (int)(zipper.charAt(1)) + (int)(zipper.charAt(2)) + (int)(zipper.charAt(3)) + (int)(zipper.charAt(4)) - 48*5) % 10;
    }
    public Barcode clone(){
	Barcode a = new Barcode(_zip);
	return a;
    }
    public int compareTo(Barcode other){
	if (this.toString().compareTo(other.toString()) < 0){
	    return -1;
	}
	else if (this.toString().compareTo(other.toString()) == 0){
	    return 0;
	}
	else{
	    return 1;
	}
    }
    public static String toCode(String zip){
	if (zip.length() != 5){
	    throw new IllegalArgumentException("The input is the wrong length.");
	}
	if ((int)(zip.charAt(0)) < 48 || (int)(zip.charAt(0)) > 57 || (int)(zip.charAt(1)) < 48 || (int)(zip.charAt(1)) > 57 || (int)(zip.charAt(2)) < 48 || (int)(zip.charAt(2)) > 57 || (int)(zip.charAt(3)) < 48 || (int)(zip.charAt(3)) > 57 || (int)(zip.charAt(4)) < 48 || (int)(zip.charAt(4)) > 57){
	    throw new IllegalArgumentException("The input must not contain non-digits.");
	}
	zip += checkSum(zip);
	String[]temp = new String[10];
	String sum = "";
	temp[0] = "||:::";
	temp[1] = ":::||";
	temp[2] = "::|:|";
	temp[3] = "::||:";
	temp[4] = ":|::|";
	temp[5] = ":|:|:";
	temp[6] = ":||::";
	temp[7] = "|:::|";
	temp[8] = "|::|:";
	temp[9] = "|:|::";
	for (int i = 0; i < zip.length(); i++){
	    sum += temp[(int)(zip.charAt(i)) - 48];
	}
	return "|" + sum + "|";
    }
    public static String toZip(String code){
	if (code.length() != 32){
	    throw new IllegalArgumentException("The input is the wrong length.");
	}
	if (code.charAt(0) != 124 || code.charAt(31) != 124){
	    throw new IllegalArgumentException("The input lacks the correct formatting of the first and last characters");
	}
	for (int place = 0; place < code.length(); place++){
	    if (code.charAt(place) != 58){
		if (code.charAt(place) != 124){
		    throw new IllegalArgumentException("Non-barcode characters are used.");
		}
	    }
	}
	String[]temp = new String[10];
	temp[0] = "||:::";
	temp[1] = ":::||";
	temp[2] = "::|:|";
	temp[3] = "::||:";
	temp[4] = ":|::|";
	temp[5] = ":|:|:";
	temp[6] = ":||::";
	temp[7] = "|:::|";
	temp[8] = "|::|:";
	temp[9] = "|:|::";
	String sum = "";
	for (int cod = 1; cod < 31; cod += 5){
	    for (int ary = 0; ary < temp.length; ary++){
		if (temp[ary].equals(code.substring(cod, cod+5))){
		    sum += ary;
		}
	    }
	}
	if (sum.length() < 6){
	    throw new IllegalArgumentException ("Encoded integers in input are invalid.");
	}
	if (checkSum(sum.substring(0, 5)) != sum.charAt(5) - 48){
	    throw new IllegalArgumentException ("Invalid checkSum.");
	}
	return sum.substring(0, 5);
    }
<<<<<<< HEAD
    //idk how to write toZip without 10 if statements and an irritating for loop involving multiplying i by 5 (?)
    //Also add exceptions to this
    public static String toZip(String code){
	//codeZip = code.substring(1, 25);
	/**String sum = "";
	for (int i = 1; i < 26; i += 5){
	    if(code.substring(i, i+5).equals("||:::")){
		sum += "0";
	    }
	//codeCheck = code.substring(26, 31);
	*/
	String[]temp = new String[10];
	temp[0] = "||:::";
	temp[1] = ":::||";
	temp[2] = "::|:|";
	temp[3] = "::||:";
	temp[4] = ":|::|";
	temp[5] = ":|:|:";
	temp[6] = ":||::";
	temp[7] = "|:::|";
	temp[8] = "|::|:";
	temp[9] = "|:|::";
	//for(something or other, may possibly be two for loops, one for array and one for code){
	String sum = "";
	for (int cod = 1; cod < 26; cod += 5){
	    for (int ary = 0; ary < temp.length; ary++){
		if (temp[ary].equals(code.substring(cod, cod+5))){
		    sum += ary;
		}
	    }
	    //there may be an exception here for "oh what if this symbol isn't there
	}
	return sum;
    }
	/**try{
sopln("sdfsdfsd\ninvalid guardrail")
sopln(":|":|:|:||:||:|::|:|:|::")
}catch(IllegalArgumentException e){
e.printStackTrace();
}
*/
=======
>>>>>>> 24d25ca546ace02c85f562f1e854ae5b5444c0d6
    public String toString(){
	return _zip + checkSum(_zip) + " " + toCode(_zip);
    }
    public static void main(String[]args){
	Barcode a = new Barcode("08451");
	Barcode b = new Barcode ("11218");
	System.out.println(a.toString());
	System.out.println(b.toString());
        System.out.println("toCode: " + toCode("08451"));
	System.out.println(a.clone());
<<<<<<< HEAD
	System.out.println(a.compareTo(b));
	System.out.println("Bismarck" + toZip("|||:::|::|::|::|:|:|::::|||::|:|"));
	//Barcode x = new Barcode ("29349872380948203948");
	//Barcode y = new Barcode ("5");
	//Barcode z = new Barcode ("343f4");
=======
	System.out.println("compareTo: " + a.compareTo(b));
	System.out.println("compareTo: " + b.compareTo(a));
	System.out.println("compareTo: " + a.compareTo(a));
	System.out.println("toZip: " + toZip("|||:::|::|::|::|:|:|::::|||::|:|"));
	try{
	    // System.out.println(toCode("09a98"));
	    //System.out.println("JQA" + toZip("|||:::|::|:|:|"));
	    //System.out.println("JQA" + toZip("|::::::::::::::::::::sdf:::::::|"));
	    //System.out.println("JQA" + toZip("|||:::|::|::|::::::::::::::::::|"));
	    //Barcode x = new Barcode ("29349872380948203948");
	    //Barcode y = new Barcode ("5");
	    //Barcode z = new Barcode ("343f4");
	}catch(IllegalArgumentException e){
	    e.printStackTrace();
	}
>>>>>>> 24d25ca546ace02c85f562f1e854ae5b5444c0d6
    }
}
