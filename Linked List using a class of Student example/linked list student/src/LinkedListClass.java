public class LinkedListClass {
	

	      public Node header;

	      public LinkedListClass() {

	            header = null;

	      }

	      // searches the node with student with id=key

	      public final Node Search(int key) {

	            Node current = header;

	            while (current != null && current.item.id != key)

	                  current = current.link;

	            if (current == null)

	                  System.out.println("There is no such item!");

	            return current;

	      }

	      // appends a Student before the head node

	      public final void Append(Student newItem) {

	            Node newNode = new Node(newItem);

	            newNode.link = header;

	            header = newNode;

	      }
	      
	            

	      // removes and return the head node

	      public final Node Remove() {

	            Node x = header;

	            if (x == null)

	                  System.out.println("It is empty!");

	            else

	                  header = header.link;

	            return x;

	      }

	      // returns the previous node of student with id=key

	      public final Node searchPrevious(int key) {

	            if (header == null)

	                  return header;

	            else {

	                  Node current = header;

	                  while (!(current.link == null) && (current.link.item.id != key))

	                        current = current.link;

	                  return current;

	            }

	      }

	     

	      //removes the student with id=key

	      public final void Delete(int key) {

	            if (header == null)

	                  System.out.println("It is empty!");

	            else {

	                  if (header.item.id == key) // The header is the one to be deleted.

	                        header = header.link;

	                  else {

	                        Node p = searchPrevious(key);

	                        if (p.link == null)

	                              System.out.println("There is no such item!");

	                        else

	                              p.link = p.link.link;

	                  }

	            }

	      }

	     

	      //prints the list from head to tail

	      public final void PrintList() {

	            if (header == null)

	                  System.out.println("It is empty!");

	            else {

	                  Node current = header;

	                  System.out.println(current.item);

	                  while (!(current.link == null)) {

	                        current = current.link;

	                        System.out.println(current.item);

	                  }

	            }

	      }

	}

