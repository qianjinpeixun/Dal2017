/*Datong Wu CSCI 1101 LAB9
  B00672049
  July 27 2017
  Test Stack class and Queue class 
  I received help with creating LinkedList and Node class from my TA but the rest is my
   own work.*/
public class Demo {
	public static void main(String[] args){
		Stack s = new Stack();
		s.push("a");
		s.push("f");
		s.push("s");
		s.push("b");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push("sss");
		System.out.println(s);
		
		Queue q = new Queue();
		q.enqueue("sdsds");
		q.enqueue("qweqs");
		q.enqueue("erw");
		q.enqueue("sadfa");
		q.enqueue("ds");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.enqueue("saf");
		System.out.println(q);
	}

}
