public class Sorts{
    public static String name(){
	return "10.Toprover.Steven";
    }
    public static void selectionSort(int[] data){
	int temp = 0;
	for (int i = 0; i < data.length; i++){
	    temp = data[i];
	    place = i;
	    for (int other = i + 1; other < data.length; other++){
		if (data[other] < temp){
		    temp = data[other];
		    place = other;
		} 
	    }
	    data[other] = data[i];
	    data[i] = temp;
	}
    }
}

