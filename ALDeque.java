// Team ShutUpJasper -- Brian Kwong, Jasper Cheung, Kelly Wang
// APCS2 pd1
// Lab02 -- All Hands on Deque!
// 2017-04-02

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ALDeque<T> implements Deque<T> {

    // instance variables
    private ArrayList<T> _container;
    private int _capacity;
    private boolean _setSize;

    // DEFAULT CONSTRUCTOR
    public ALDeque() {
	_container = new ArrayList<T>();
	_setSize = false;
    }

    // CONSTRUCTOR to set capacity
    public ALDeque( int size ) {
	_container = new ArrayList<T>();
	_capacity = size;
	_setSize = true;
    }

    // ACCESSORS

    public boolean isEmpty() {
	return _container.size() == 0;
    } // Q(1)

    public int size() {
	return _container.size();
    } // Q(1)

    // if empty, throw an exception
    // otherwise return element at front of deque
    public T peekFirst() {
	if ( isEmpty() ) throw new NoSuchElementException("YOU CAN NOT DO THAT!!!!!!!");
	return _container.get(0);
    } // Q(1)

    // if empty, throw an exception
    // otherwise return element at back of deque
    public T peekLast() {
	if ( isEmpty() ) throw new NoSuchElementException("YOU CAN NOT DO THAT!!!!!!!");
	return _container.get( size()-1 );
    } // Q(1)

    // MUTATORS

    // if empty, return a null pointer
    // otherwise remove and return first element
    public T pollFirst() { 
	if ( isEmpty() ) return null;
	T retVal = _container.get(0);
	_container.remove(0);
	return retVal;
    } // Q(n)

    // if empty, return a null pointer
    // otherwise remove and return last element
    public T pollLast() {
	if ( isEmpty() ) return null;
	T retVal = _container.get(size()-1);
	_container.remove( size() - 1 );
	return retVal;
    } // Q(1)
  
    // if empty, throw an exception
    // otherwise remove and return first element
    public T removeFirst() {
        if ( isEmpty() ) throw new NoSuchElementException("YOU CAN NOT DO THAT!!!!!!!");
	T retVal = _container.get(0);
	_container.remove(0);
	return retVal;
    } // Q(n)

    // if empty, throw an exception
    // otherwise remove and return last element
    public T removeLast() {
	if ( isEmpty() ) throw new NoSuchElementException("YOU CAN NOT DO THAT!!!!!!!");
	T retVal = _container.get( size()-1);
	_container.remove( size() - 1 );
	return retVal;
    } // Q(1)

    // add element to front of deque
    public void addFirst( T e ) {
	_container.add(0, e);
    } // Q(n)

    // add element to end of deque
    public void addLast( T e ) {
	_container.add(e);
    } // Q(1)

    // if fixed capacity set during construction,
    // restrict user from overfilling deque
    // otherwise add to front as normal
    public boolean offerFirst( T e ) {
	if (size() >= _capacity && _setSize) {
	    return false;
	}
	else {
	    addFirst(e);
	    return true;
	}
    } // Q(n)

    // if fixed capacity set during construction,
    // restrict user from overfilling deque
    // otherwise add to back as normal
    public boolean offerLast( T e ) {
	if (size() >= _capacity && _setSize) {
	    return false;
	}
	else {
	    addLast(e);
	    return true;
	}
    } // Q(1)

    public String toString() {
        String ret = "HEAD <--> ";
        for (T value : _container) {
            ret += value + " <--> ";
        }
        return ret + "TAIL";
    } // Q(n)
    
    public static void main ( String[] args ) {
	ALDeque<String> kelly = new ALDeque<String>();
	kelly.addFirst("hello");
	kelly.addFirst("eyebrow");
	System.out.println( kelly );
	kelly.addLast("sponge");
	kelly.addLast("nose");
	System.out.println( kelly );
	System.out.println("Front: " + kelly.peekFirst());
	System.out.println("Back: " +  kelly.peekLast());
	System.out.println("Removed: " + kelly.removeLast());
	System.out.println("Removed: " + kelly.removeFirst());
	System.out.println( kelly );
	System.out.println("Removed: " + kelly.removeFirst());
	System.out.println("Removed: " + kelly.removeFirst());
	System.out.println("Removed: " + kelly.pollFirst());
	System.out.println("Removed: " +  kelly.removeFirst() );
    }

}
