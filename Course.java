
public class Course {
	private String name;
	private double grade;

	public Course(String s) {
		name = s;
		grade = 0;
	}

	public void setGrade(double g) {
		grade = g;
	}

	public double getGrade() {
		return grade;
	}

	@Override 
	public String toString() {
		return name + ": " + grade;

	}
}