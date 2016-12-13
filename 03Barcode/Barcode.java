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
	_checkDigit = checkSum();
    }
    private int checkSum(){
	return ((int)(_zip.charAt(0)) + (int)(_zip.charAt(1)) + (int)(_zip.charAt(2)) + (int)(_zip.charAt(3)) + (int)(_zip.charAt(4)) - 48*5) % 10;
    }
    public Barcode clone(){
	Barcode a = new Barcode(_zip);
	return a;
    }
    public int compareTo(Barcode other){
	System.out.println(other.toString().substring(1, 6));
	//this uses toZip, so that must be written first, but when it is, the whole barcode must be toZipped (with a private thing for checkSum again and dropping guard rails).
	//then compare the toZipped zip codes to produce answer as per usual
	System.out.println("compareTo is uncompleted and must be finished!!!");
	return 5;
    }
    public static String toCode(String zip){
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
	return sum;
    }
    private String digitToCode(int digit){
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
	sum = temp[digit];
	return sum;
    }
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
    public String toString(){
	return "|" + toCode(_zip) + digitToCode(_checkDigit) + "|";
    }
    public static void main(String[]args){
	Barcode a = new Barcode("08451");
	Barcode b = new Barcode ("11218");
	System.out.println(a.toString());
	System.out.println(b.toString());
        System.out.println(toCode("777"));
	System.out.println(a.clone());
	System.out.println(a.compareTo(b));
	System.out.println("Bismarck" + toZip("|||:::|::|::|::|:|:|::::|||::|:|"));
	//Barcode x = new Barcode ("29349872380948203948");
	//Barcode y = new Barcode ("5");
	//Barcode z = new Barcode ("343f4");
    }
}
