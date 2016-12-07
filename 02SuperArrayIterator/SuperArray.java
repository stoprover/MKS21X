import java.util.Iterator;
public class SuperArray implements Iterable<String>{
    //special thanks to Janice Tjan for helping me with some of the actual java involved in writing the original SuperArray.java, because I was confused about constructors and some java syntax.
    private String[] data;
    private int size;
    public SuperArray(){
	data = new String[10];
	size = 0;
    }
    public SuperArray(int initialCapacity){
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException("initialCapacity is negative!");
	}
	else {
	    data = new String[initialCapacity];
	    size = 0;
	}
    }
    public boolean add(String element){
	size++;
	if (data.length <= size - 1){
	    grow();
	}
	for (int i = 0; i < data.length; i++){
	    if (i >= size - 1) {
		data[i] = element;
	    }
	}
	return true;  
    }
    private void grow(){
        String[]temp = new String[data.length];
	  for (int i = 0; i < data.length; i++){
	      temp[i] = data[i];
	  }
	  data = new String[temp.length * 2];
	  for (int i = 0; i < temp.length; i++){
	      data[i] = temp[i];
	  }
    }
    public String get(int index){
	if (index < 0) {
	    throw new IndexOutOfBoundsException("Index is negative!");
	}
	else if (index >= size()){
	    throw new IndexOutOfBoundsException("Index is >= size !");
	}
	else{
	    return data[index];
	}
    }
    public int size(){
	int isSize = size;
	return isSize;
    }
    public String toString(){
        String result = "[ ";
	if (size == 0){
	    return "[]";
	}
	else{
	    for (int i = 0; i < size; i++){
		if (i + 1  < size){
		    result += data[i] + ", ";
		}
		else{
		    result += data[i] + "]";
		}
	    }
	}
	return result;
    }
    public String toStringDebug(){
        String result = "[ ";
            for (int i = 0; i < size; i++){
		if (i == data.length - 1){
		    result += data[i] + "]";
		}
		else{
		    result += data[i] + ", ";
		}
            }
	    for (int j = size; j <= data.length - 1; j++){
		if ( j < data.length - 1) {
		    result += "_, ";
		}
		else {
		    result += "_]";
		}
	    }
  	    return result;
    }
    public void clear(){
	size = 0;
    }
    public boolean isEmpty(){
	return size == 0;
    }
    public String set (int index, String element){
	if (index < 0) {
	    throw new IndexOutOfBoundsException("Index is negative!");
	}
	else if (index >= size()){
	    throw new IndexOutOfBoundsException("Index is >= size !");
	}
	else{
	    String popped = data[index];
	    data[index] = element;
	    return popped;
	}
    }
    public void add(int index, String element){
	size++;
	if (size > data.length){
	    grow();
	}
	if (index == size()){
	    grow();
	}
	if (index == size() - 1) {
	    data[size - 1] = element;
	}
	else {
	    for (int i = size - 1; i > index; i--){
		data[i] = get(i - 1);
	    }
	    data[index] =  element;
	}
	if (index < 0) {
	    size--;
	    throw new IndexOutOfBoundsException("Index is negative!");
	}
	if (index > size()) {
	    size--;
	    throw new IndexOutOfBoundsException("Index is > size!");
	}
    }
    public String remove(int index){
	if (index < 0) {
	    throw new IndexOutOfBoundsException("Index is negative!");
	}
	else if (index >= size()){
	    throw new IndexOutOfBoundsException("Index is >= size !");
	}
	else{
	    String temp = data[index];
	    if (index < data.length - 2){
		for (int i = index; i <= data.length - 2; i++){
		    if (index < data.length - 1){
			data[i] = data[i + 1];
		    }
		    else{
			data[i] = "";
		    }
		}
	    }
	    else {
		data[index] = "";
	    }
	    size--;
	    return temp;
	}
    }
    public String[] toArray(){
	String[] result = new String [data.length];
        for (int i = 0; i < size(); i++){
	    result[i] = data[i];
        }
	return result;
    }
    public int indexOf(String i){
	for (int j = 0; j < data.length; j++){
	    if (data[j].equals(i)){
		return j;
	    }
	}
	return -1;
    }
    public int lastIndexOf(String i){
	for (int j = data.length - 1; j >= 0; j--){
	    if (data[j].equals(i)){
		return j;
	    }
	}
	return -1;
    }
    public Iterator<String> iterator(){
        SuperArrayIterator a = new SuperArrayIterator(this);
	return a;
    }
}
