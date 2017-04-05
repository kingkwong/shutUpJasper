//Edward Ro
//APCS2
//4/4/17
//HW#29

public class DequeDriver {
    
    public static void main( String[] args ) {
	ALDeque bob = new ALDeque(); //instantiates new deque implementation
	bob.addFirst("you");
	bob.addFirst("for");
	bob.addFirst("cake");
	bob.offerFirst("no"); //tests offerFirst()
	System.out.println("bob:" + bob); //adds to bob in a way that it shows "no cake for you"
	
        ALDeque marley = new ALDeque(); //instantiates new deque implementation
	marley.addLast("no");
	marley.addLast("cake");
	marley.addLast("for");
	marley.offerLast("you"); //tests offerLast()
	System.out.println("marley: " + marley); //like the one above, but adds it to the end, in a order so that it represents the same thing as 'bob'
	

	System.out.println("last: " + marley.peekFirst()); //returns no
	System.out.println("front: " + marley.peekLast()); //returns you
	System.out.println("removed first: " + marley.removeFirst()); //returns 'no', removes no
	System.out.println("removed last: " + marley.removeLast());  //returns 'you', removes you
	System.out.println("removed cake: " + marley.pollFirst()); //returns "cake", removes cake
	System.out.println("removed for: " + marley.pollLast()); //returns "cake", removes cake
	System.out.println(marley); //returns "cake for"
    }
}
