/*Datong Wu 
  LAB 6
  Q1 ComputerScience class
  B00672049*/
public class ComputerSecience extends Course{
	private double grades[];
	private int numGrades;
	
	public ComputerSecience(int num){
		setFinalGrade(0);
		numGrades = 0;
		grades = new double[num];
		
	}
	
	public double[] getGrades(){
		return grades;
	}
	
	public void addGrade(double grade){
		if(numGrades<=grades.length){
			grades[numGrades++] = grade;
		}
		

	}

	@Override
	public void calculateFinalGrade() {
		double SumOfGrades = 0;
		for(int i=0; i<numGrades; i++){
			SumOfGrades+=grades[i];
		}
		super.setFinalGrade(SumOfGrades/numGrades);
	}
	
	public double findMax(){
		double max = 0;
		for(int i=1; i<grades.length;i++){
			if(grades[i]>max){
				max = grades[i];
			}
		}
		return max;
	}
	
	public String toString(){
		return super.toString()+" and the highest grade: "+findMax();
	}




	
	
}
