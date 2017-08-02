/*Datong Wu CSCI 1101 LAB9
  B00672049
  July 27 2017
  Stack class use Linklist to store String data and use Stack method
  I received help with creating LinkedList and Node class from my TA but the rest is my
   own work.*/

public class Stack {
	private LinkedList stack;

	public Stack() {
		stack = new LinkedList();
	}

	public boolean isEmpty() {
		return (stack.isEmpty());
	}

	public void push(String a) {
		stack.addToFront(a);

	}

	public void pop() {
		stack.removeFront();
		;
	}

	public String peek() {
		if (!stack.isEmpty()) {
			return stack.getFrontData();
		} else {
			return null;
		}
	}

	public String toString() {
		return stack.toString();
	}

}
