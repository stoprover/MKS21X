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
	    data[indOfSSF]= data[m];
	    data[m] = smallestSoFar;
	}
    }
    public static void insertionSort(int[]data){
	for (int nextUnsorted = 1; nextUnsorted < data.length; nextUnsorted++){
	    //loop through everything right of nextUnsorted, find smallest, loop through everything left of nextUnsorted, find spot, move stuff over, add
	    int smallestRNU = data[nextUnsorted];
	    int placeOfRNU = nextUnsorted;
	    for (int rightNU = nextUnsorted; rightNU < data.length; rightNU++){
		if (data[rightNU] < smallestRNU){//maybe all this must be from right: change it if necessary
		    smallestRNU = data[rightNU];
		    placeOfRNU = rightNU;
		}
	    }
	    int placeToInsert = 0;
	    for (int i = 0; i < nextUnsorted; i++){
		if (data[i] > smallestRNU){
		    placeToInsert = i;
		}
		if (i == nextUnsorted - 1 && data[i] < smallestRNU){
		    placeToInsert = nextUnsorted;
		}
	    }
	    for (int j = placeOfRNU; j > placeToInsert; j--){
		data[j] = data[j - 1];
	    }
	    data[placeToInsert] = smallestRNU;
	}
    }
    public static String printArray (int[]data){
	String sum = "[";
	for (int i = 0; i < data.length; i++){
	    sum += data[i];
	    if (i == data.length - 1){
		sum += "]";
	    }
	    else{
		sum +=  ", ";
	    }
	}
	return sum;
    }
    public static void main(String[]args){
	int[]ary = new int[5];
	ary[0] = 64;
	ary[1] = 25;
	ary[2] = 12;
	ary[3] = 22;
	ary[4] = 11;//64, 25, 12, 22, 11;     25, 64, 12,22,11
	//selectionSort(ary);
	insertionSort(ary);
	System.out.println(printArray(ary));
	int[]dairy = new int[4];
	dairy[0] = 54;
	dairy[1] = 1;
	dairy[2] = 32;
	dairy[3] = 15;
	//selectionSort(dairy);
	insertionSort(dairy);
	System.out.println(printArray(dairy));
	System.out.println(name());
    }
}

