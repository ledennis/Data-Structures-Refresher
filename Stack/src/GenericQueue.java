import java.util.*;

public class GenericQueue<T> {
  private ArrayList<T> queue;

  public GenericQueue() {
    this.queue = new ArrayList<T>();
  }

  protected void pop() {
    if (!isEmpty()) {
      System.out.println("Popping " + queue.get(0));
      queue.remove(0);
    }
  }

  protected void push(T var) {
    queue.add(var);
  }

  protected boolean isEmpty() {
    if (queue.isEmpty()) {
      System.out.println("Queue is empty!");
      return true;
    } else {
      return false;
    }
  }

  protected void printQueue() {
    if (!isEmpty()) {
      Iterator<T> queueIterator = queue.iterator();

      while (queueIterator.hasNext()) {
        System.out.println(queueIterator.next());
      }
    }
  }
}
