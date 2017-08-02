/*Datong Wu 
  LAB 6
  Q1 Course abstract class
  B00672049*/
public abstract class Course {

	private String courseName;
	private String instructor;
	private double finalGrade;

	public void setName(String n) {
		courseName = n;
	}

	public String getName() {
		return courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instr) {
		instructor = instr;
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(double g) {
		finalGrade = g;
	}
	
	public abstract void calculateFinalGrade();
	
	public String toString(){
		return "Coursename: "+courseName+" Instructor: "+instructor+" Average of grade"+finalGrade;
	}

}
