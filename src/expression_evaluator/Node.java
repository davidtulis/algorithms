package expression_evaluator;

/**
 * Node of a singly linked list, which stores references to its
 * element and to the next node in the list.
 *
 * @author Natasha Gelfand
 * @author Roberto Tamassia
 * @author Michael Goodrich
 */
public class Node<E>
{
  // Instance variables:
  private E element;
  private Node<E> next;
  /** Creates a node with null references to its element and next node. */
  public Node()
  {
    this(null, null);
  }

  /** Creates a node with the given element and next node. */
  public Node(E e, Node<E> n)
  {
    element = e;
    next = n;
  }

  // Accessor methods:
  public E getElement()
  {
    return element;
  }

  public Node<E> getNext()
  {
    return next;
  }

  // Modifier methods:
  public void setElement(E newElem)
  {
    element = newElem;
  }

  public void setNext(Node<E> newNext)
  {
    next = newNext;
  }
}
