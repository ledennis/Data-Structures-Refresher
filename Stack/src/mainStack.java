import java.util.*;

public class mainStack {
  public static void main(String[] args) {
    GenericStack<Integer> intStack = new GenericStack<Integer>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    intStack.push(4);

    intStack.printStack();
    intStack.pop();
    intStack.pop();
    intStack.pop();
    intStack.pop();
    intStack.printStack();
  }
}
