public interface Deque <Q> {
    
    public void addLast ( Q e);
    
    public Q removeFirst();
    
    public void addFirst( Q e );
    
    public void addLast ( Q e );
    
    public Q peekFirst();

    public Q peekLast();

    public Q getFirst();

    public Q getLast();
    
}//end interface Deque                                                                                           
