public interface Deque <Q> {
  
    public Q removeFirst();
    
    public Q removeLast();
    
    public void addFirst( Q e );
    
    public void addLast ( Q e );

    public boolean offerFirst( Q e );

    public boolean offerLast( Q e );
    
    public Q peekFirst();

    public Q peekLast();

    public Q pollFirst();

    public Q pollLast();

    public boolean isEmpty();

    public int size();
  
}//end interface Deque                                                                                           
