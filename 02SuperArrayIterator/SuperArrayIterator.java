import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String>{
    private SuperArray whichOne;
    private int element;
    public SuperArrayIterator (SuperArray potato){
        whichOne = potato;
	element = 0;
    }
    public boolean hasNext(){
	return whichOne.size() > element;
    }
    public String next(){
	if (hasNext()){
	    element++;
	    return whichOne.get(element - 1);
	}
	else{
	    throw new NoSuchElementException();
	    //return "There are no more elements";
	}
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
    public static void main (String[]args){
	SuperArray b = new SuperArray();
	b.add("apples");
	b.add("bees");
	b.add("cats");
	b.add("Dogs");
	SuperArrayIterator a = new SuperArrayIterator(b);
	System.out.println(a.hasNext());
	System.out.println(a.next());
	System.out.println(a.hasNext());
	System.out.println(a.next());
	System.out.println(a.hasNext());
	System.out.println(a.next());
	System.out.println(a.hasNext());
	System.out.println(a.next());
	System.out.println(a.hasNext());
	System.out.println(a.next());
	//a.remove();
    }
}
