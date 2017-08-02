
/*Lab 7, Question 3 CSCI 1101
   Alphabetize.java use for sorting the wordlist order
   July 18, 2017
   Datong Wu B00672049
   This is entirely my own work. */
import java.util.ArrayList;

public class AlphabetizedList extends WordList {

	public AlphabetizedList() {
		super();
	}

	public AlphabetizedList(ArrayList<String> l) {// set internal ArrayList
													// equal to parameter
		super();
		setList(l);
		alphabetize();
	}

	public boolean compare(WordList w) {// implement abstract method.
		String word1 = getList().get(0);
		String word2 = w.getList().get(0);
		if (word1.compareTo(word2) < 0) {
			return true;
		} else if (word1.compareTo(word2) > 0) {
			return false;// break
		} else {
			return true;
		}
	}

	public void alphabetize() {
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < getList().size(); i++) {// alphabetizes ArrayList.
			String s1 = getList().get(i);
			int p = 0;
			boolean l = false;
			if (i == 0)
				a.add(s1);
			else {
				l = false;
				for (int j = 0; j < a.size(); j++) {
					String t = a.get(j);
					if (s1.compareTo(t) < 0) {
						p = j;
						l = false;
						break;
					} else {
						l = true;
					}
				}
				if (l == false) {
					a.add(p, s1);
				} else {
					a.add(s1);
				}
			}
		}
		setList(a);
	}

	public void merge(AlphabetizedList a1) {// merge method
		ArrayList<String> n = new ArrayList<String>();
		for (String s : getList()) {
			n.add(s);
		}
		for (String s : a1.getList()) {
			n.add(s);
		}
		setList(n);
		alphabetize();
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < getList().size(); i++) {
			s = s + getList().get(i) + ",";
		}
		s = s.substring(0, s.length() - 1);
		return s;
	}

}
