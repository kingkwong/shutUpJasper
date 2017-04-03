// Team Shut-Up-Jasper -- Brian Kwong, Jasper Cheung, Kelly Wang
// APCS2 pd1
// Lab02 -- All Hands on Deque!
// 2017-04-02

import java.util.ArrayList;

public class ALDeque<T> implements Deque<T> {

    private  ArrayList<T> _container;

    public ALDeque() {
	_container = new ArrayList<T>();
    }

    public  boolean isEmpty() {
	return _container.size() == 0;
    }

    public T peekFirst() {
	return _container.get(0);
    }

    public T peekLast() {
	return _container.get( _container.size()-1 );
    }

    public T removeLast() {
	T retVal = _container.get(_container.size()-1);
	_container.remove( _container.size() - 1 );
	return retVal;
    }

    public T removeFirst() {
	T retVal = _container.get(0);
	_container.remove(0);
	return retVal;
    }

    public void addFirst( T e ) {
	_container.add(0, e);
    }

    public void addLast( T e ) {
	_container.add(e);
    }

    public String toString() {
        String ret = " ";
        for (T value : _container) {
            ret += value + " ";
        }
        return ret;
    }
    
    public static void main ( String[] args ) {
	ALDeque<String> kelly = new ALDeque<String>();
	kelly.addFirst("hello");
	kelly.addFirst("eyebrow");
	System.out.println( kelly );
	kelly.addLast("sponge");
	kelly.addLast("nose");
	System.out.println( kelly );
	kelly.peekFirst();
	kelly.peekLast();
	System.out.println(kelly.removeLast());
	System.out.println(kelly.removeFirst());
	System.out.println( kelly );
    }

}
