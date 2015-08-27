package expression_evaluator;


/**
 * Implementation of the stack ADT by means of a singly linked list.
 *
 * @author Natasha Gelfand
 * @author Roberto Tamassia
 * @see Node 
 */

public class NodeStack<E> implements Stack<E>
{
  protected Node<E> top;	// reference to the head node
  protected int size;		// number of elements in the stack

  /** Creates an empty stack. */
  public NodeStack()
  {	// constructs an empty stack
    top = null;
    size = 0;
  }

  public int size()
  {
	  return size;
  }

  public boolean isEmpty()
  {
    if (top == null)
       return true;
    return false;
  }

  public void push(E elem)
  {
    Node<E> v = new Node<E>(elem, top);	// create and link-in a new node
    top = v;
    size++;
  }

  public E top() throws EmptyStackException
  {
    if (isEmpty())
       throw new EmptyStackException("Stack is empty.");
    return top.getElement();
  }

  public E pop() throws EmptyStackException
  {
    if (isEmpty())
       throw new EmptyStackException("Stack is empty.");
    E temp = top.getElement();
    top = top.getNext();	// link-out the former top node
    size--;
    return temp;
  }


 /**
  * Returns a string representation of the stack as a list of elements,
  * with the top element at the end: [ ... , prev, top ].
  * This method runs in O(n) time, where n is the size of the stack.
  * @return textual representation of the stack.
  */
  public String toString()
  {
    String s;
    Node<E> cur = null;
    s = "[";
    int n = size();
    if (n > 0) {
      cur = top;
      s += cur.getElement();
    }
    if (n > 1)
      for (int i = 1; i <= n-1; i++)
      {
	     cur = cur.getNext();
	     s += ", " + cur.getElement();
      }
    s += "]";
    return s;
  }

 /**
  * Prints information about an operation and the stack.
  * @param op operation performed
  * @param element element returned by the operation
  * @return information about the operation performed, the element
  * returned by the operation and the content of the stack after
  * the operation.
  */
  public  void status(Stack S, String op, Object element)
  {
    System.out.println("---------------------------------");
    System.out.println(op);
    System.out.println("Returned: " + element);
    String emptyStatus;
    if (S.isEmpty())
      emptyStatus = "empty";
    else
      emptyStatus = "not empty";
    System.out.println("size = " + S.size() + ", " + emptyStatus);
    System.out.println("Stack: " + S);
  }

 
}
