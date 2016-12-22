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
    public static void bubbleSort(int[]data){
	int numSwaps = 1;
	int temp;
	while (numSwaps != 0){
	    numSwaps = 0;
	    for (int i = 0; i < data.length - 1; i++){
		if (data[i] > data[i + 1]){
		    temp = data[i+1];
		    data[i + 1] = data[i];
		    data[i] = temp;
		    numSwaps++;
		}
	    }
	}
    }
	//loop through to second-to-last,compare data[counter] and data[counter + 1], swap if necessary. also make sure to have a swap variable, always set it back to zero whenever you start from the beginning again, and if its > 0, go through again; else, stop the swapping. furthemore, there should be a way to go back from last digits, (make the test for the data get smaller and smaller if the last ones are well-sorted and don't need to be swapped)since 5 and 8 are gucci, don't look at it again, instead look at 2 and 5.
	//system.currentTimeMillis(), don't measure sort if wrong; is a thing that you should use!!!!!!!!!!!!!!!!!!!!  
    public static String printArray (int[]data){
	String sum = "[";
	if (data.length == 0){
	    return sum + "]";
	}
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
	//insertionSort(ary);
	bubbleSort(ary);
	System.out.println("ary.." + printArray(ary));
	int[]dairy = new int[4];
	dairy[0] = 54;
	dairy[1] = 1;
	dairy[2] = 32;
	dairy[3] = 15;
	//selectionSort(dairy);
	//insertionSort(dairy);
	bubbleSort(dairy);
	System.out.println("dairy" + printArray(dairy));
	System.out.println(name());
	int[]fairy = new int[0];
	//selectionSort(fairy);
	//insertionSort(fairy);
	bubbleSort(fairy);
	System.out.println("fairy" + printArray(fairy));
    }
}

