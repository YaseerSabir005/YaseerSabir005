
/**
 * @author ysabir
 * Title: Weighted class.
 */
public class Weighted extends Course {

	private double weight = 0;
	
	public Weighted( double w,	String s) {
		
		super(s);// sends the name of the course
		weight = w;//this is the weight of the course
		
	}
	public double getWeightedGrade() {
		
		return weight*super.getGrade();// returns a weighted grade
		
	}
	@Override
	public String toString() {
		return super.toString()+" Weighted: "+getWeightedGrade();// calls the parent class toString and concatenates with getWeightedGrade()
	}
	
	
}
