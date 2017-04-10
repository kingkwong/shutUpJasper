//Team RatItTooE Jonathan Quang, Joshel Xidieng, Edward Ro

public class DequeTester2{
     public static void main (String[] args){

	ALDeque food = new ALDeque();

	//Test the remove functions of empty deque
	try {
	food.removeLast();
	System.out.println(food);
	}
	catch (Exception e){
	    System.out.println(e);
	}

	try {
	    food.removeFirst();
	    System.out.println(food);
	}
	catch (Exception e){
	    System.out.println(e);
	}
	


        //Test the size of an empty list
	System.out.println(food.size());

	// 8 should be in the front followed by 7
	food.addLast(8);
	food.addLast(7);
	System.out.println(food);

	//9 should be in the front, followed by 8 and 7
	food.addFirst(9);
	System.out.println(food);

	//test if the capcity stuff works with 0 as the capacity
	//offer should return false;
	ALDeque cap = new ALDeque(0);
	System.out.println(cap.offerFirst("bob"));

	//test if if ALDeque can handle negative numbers
	ALDeque neg = new ALDeque(-2);
	System.out.println(neg.size());
  
	
    }
}
