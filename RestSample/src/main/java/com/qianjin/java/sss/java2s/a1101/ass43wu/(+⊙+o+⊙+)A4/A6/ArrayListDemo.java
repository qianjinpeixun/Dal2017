/*Datong Wu 
  LAB 6
  Q2 arraylist
  B00672049*/
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>(50);
		ArrayList<String> a2 = new ArrayList<String>(50);
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter words on one line, end with -1");
		String city = kb.nextLine();
		while (!city.equals("-1")) {
			a1.add(city);
			city = kb.nextLine();
		}
		for (int i = 0; i < a1.size(); i++) {//CHECK LIST OVER AGAIN
			for (int j = i + 1; j < a1.size(); j++) {
				if (a1.get(i).equals(a1.get(j))) {
					a1.remove(i);//REMOVE THE SAME STRING
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < a1.size(); i++) {
			a1.get(i);//REWRITE A1
		}
		for (int i = 0; i<a1.size();i++){
			a2.add(a1.get(i));//COPY ALL STRING FROM A1 TO A2
		}
		System.out.println(a2);
	}
}
