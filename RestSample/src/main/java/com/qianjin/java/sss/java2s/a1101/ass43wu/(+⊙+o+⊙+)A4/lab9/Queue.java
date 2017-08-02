/*Datong Wu CSCI 1101 LAB9
  B00672049
  July 27 2017
  Queue class use Linklist to store String data and use Queue method
  I received help with creating LinkedList and Node class from my TA but the rest is my
   own work.*/
public class Queue {
	private LinkedList Queue;
	
	public Queue(){
		Queue = new LinkedList();
	}
	
	public boolean isEmpty(){
		return (Queue.isEmpty());
	}
	
	public void enqueue(String a){
		Queue.addToFront(a);
	}
	
	public void dequeue(){
		Queue.removeLast();
	}
	
	public String peek(){
		if(!Queue.isEmpty()){
			return Queue.getFrontData();
		}else{
			return null;
		}
	}
	
	public String toString(){
		return Queue.toString();
	}

}
