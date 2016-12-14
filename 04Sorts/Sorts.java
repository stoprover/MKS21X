public class Sorts{
    public static String name(){
	return "10.Toprover.Steven";
    }
    public static void selectionSort(int[]data){
	for (int m = 0; m < data.length; m++){
	    int smallestSoFar = data[m];
	    int indOfSSF = m;
	    for (int i = m + 1; i < data.length; i++){
		if (data[i] < smallestSoFar){
		    smallestSoFar = data[i];
		    indOfSSF = i;
		}
	    }
	    for (int j = 0; j < data.length; j++){
		if (data[j] > smallestSoFar){
		    data[indOfSSF] = data[j];
		    data[j] = smallestSoFar;
		    j = data.length;
		}
	    }
	}
    }
    public static void main(String[]args){
	int[]ary = new int[5];
	ary[0] = 64;
	ary[1] = 25;
	ary[2] = 12;
	ary[3] = 22;
	ary[4] = 11;
	selectionSort(ary);
	System.out.println(ary[0] + " " + ary[1] + " " + ary[2] + " " + ary[3] + " " + ary[4]);
	int[]dairy = new int[4];
	dairy[0] = 54;
	dairy[1] = 1;
	dairy[2] = 32;
	dairy[3] = 15;
	selectionSort(dairy);
	System.out.println(dairy[0] + " " + dairy[1] + " " + dairy[2] + " " + dairy[3]);
	System.out.println(name());
    }
}

