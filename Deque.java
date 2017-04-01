public interface Deque <Q> {
  
    public Q removeFirst();
    
    public Q removeLast();
    
    public void addFirst( Q e );
    
    public void addLast ( Q e );
    
    public Q peekFirst();

    public Q peekLast();

}//end interface Deque                                                                                           
