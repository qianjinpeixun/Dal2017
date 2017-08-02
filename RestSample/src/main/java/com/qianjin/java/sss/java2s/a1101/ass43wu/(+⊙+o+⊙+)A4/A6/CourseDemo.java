/*Datong Wu 
  LAB 6
  Q1 demo for test two class
  B00672049*/
public class CourseDemo {
  public static void main(String[] args){
	  ComputerSecience a = new ComputerSecience(8);
	  a.setName("CSCI 11O1");
	  a.setInstructor("Jeremy");
	  a.addGrade(50);
	  a.addGrade(52);
	  a.addGrade(54);
	  a.addGrade(56);
	  a.addGrade(58);
	  a.addGrade(60);
	  a.addGrade(62);
	  
	  a.calculateFinalGrade();

	  
	  System.out.println(a);
	  
  }
}
