
/*Lab 7, Question 3 CSCI 1101
   WordList.java use for abstract class.
   July 18, 2017
   Datong Wu B00672049
   This is entirely my own work. */
import java.util.ArrayList;

public abstract class WordList {

	private ArrayList<String> list;

	public WordList() {
		list = new ArrayList<String>();

	}

	public ArrayList<String> getList() {
		return list;// shallow copy
	}

	public void setList(ArrayList<String> l) {
		list = new ArrayList<String>();
		for (String s : l) {
			list.add(s);// deep copy
		}
	}

	public abstract boolean compare(WordList w);// abstract method will be used

}
