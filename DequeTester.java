/*
Datian Zhang
APCS2 pd1
HW22 - Stacks on Stacks on Stacks on Stacks...
2017-03-23
*/


public class DequeTester{

    public static void main( String[] args ){
	Deque<String> q = new ALDeque<String>();
	
	// tests to see if any methods break for a new Deque.
	q.removeFirst();
	q.removeLast();
	q.peekFirst();
	q.peekLast();
	System.out.println(q.getFirst());
	System.out.println(q.getLast());
	System.out.println(q);
	// Checks if will give true, if it's empty.
	System.out.println(q.isEmpty());
	
	// sees if you can start queueing from back and get from front, vice versa without it breaking
	q.addLast("super");
	
	System.out.println(q.isEmpty()); // should return false
	// making sure that the following two are the same value
	System.out.println(q.getFirst());
	System.out.println(q.getLast());

	// queueing from front, removing from back.
	q.removeFirst();
	q.addFirst("duper");
	q.removeLast();

	q.removeLast(); // checks if it'll break after being empty

       	// tests to see if it works for ints and strings at the same time.
	//	q.addLast("Bunny");
	//q.addLast(2);
	q.addLast("qpek");
	q.removeLast();
	q.removeLast();
	q.removeLast();
	/*
	System.out.println("\nnow enqueuing from front end...");
	q.addFirst("happy");
	q.addFirst("dappy");
	q.addFirst("zappy");
	System.out.println(q);//show how it looks at this point

	System.out.println("\nnow enqueuing from back end...");
	q.addLast("super");
	q.addLast("duper");
	q.addLast("muper");
	System.out.println(q);//show how it looks at this point

	System.out.println("\nnow testing toString()...");
	System.out.println( q );

	System.out.println("\nnow testing get methods...");
	System.out.println( q.getFirst() );
	System.out.println( q.getLast() );
	
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( q.removeFirst() );
	System.out.println( q.removeFirst() );
	System.out.println( q.removeFirst() );

	System.out.println("\nnow dequeuing from back end...");
	System.out.println( q.removeLast() );
	System.out.println( q.removeLast() );
	System.out.println( q.removeLast() );

	//	System.out.println("\nnow dequeuing fr empty deque...");
	//	System.out.println( q.removeFirst() );
	*/
    }
}
