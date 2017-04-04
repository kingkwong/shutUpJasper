#  :scream: :scream: shutUpJasper  :scream: :scream: 
Kelly Wang, Brian Kwong, Jasper Cheung

### Deque impelements the following methods:

##### removeFirst
Removes the first element, if list is empty exception thrown
##### removeLast
Removes the last element, if list is empty exception thrown
##### addFirst
Adds to the front of the list
##### addLast
Adds to the end of the list
##### peekFirst
Look at the element at the front of the list, returns null if list is empty
##### pollFirst
Remove first element, returns null if list is empty
##### peekLast
Look at the element at the end of the list, returns null if list is empty
##### pollLast
Remove last element, returns null if list is empty
##### isEmpty
Checks if the list is empty

These are similar to the methods needed to implement a Queue, but Deque includes methods that allow the user to peek at, add to, or remove from both the front and end of the list.

### Reasons for using an ArrayList :thinking:

Although an ArrayList would require an O(n) runtime when adding and removing from one end, it is a lot simpler and easier to implement than doubly linked nodes. ArrayLists have built-in size and index methods. They are more versatile than arrays because their size can be changed. 
