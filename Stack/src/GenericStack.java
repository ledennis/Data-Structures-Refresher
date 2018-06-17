import java.util.*;

public class GenericStack<T> {
  private ArrayList<T> stack;

  public GenericStack() {
    stack = new ArrayList<T>();
  }

  protected void pop() {
    System.out.println("Popping off " + stack.get(0));
    stack.remove(0);
  }

  protected void push(T var) {
    System.out.println("Pushing on " + var);
    stack.add(0, var);
  }

  protected void printStack() {
    Iterator<T> stackIterator = stack.iterator();

    while (stackIterator.hasNext()) {
      System.out.println(stackIterator.next());
    }

    if (stack.isEmpty()) {
      System.out.println("Stack is empty.");
    }
  }
}
