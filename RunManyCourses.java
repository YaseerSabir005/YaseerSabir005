
/**
 * @author ysabir Title: Many Courses Runner Program.
 */
public class RunManyCourses {

	public static void main(String[] args) {
		String[] names1 = { "Honors English", "APCS", "Chemistry", "History" };

		double[] grades1 = { 71, 85, 94, 87 };
		Double[] weights1 = { 1.1, 1.2, null, null };
		Course[] c = setup(names1, grades1, weights1);

		for (Course cor : c)
			System.out.println(cor);

		double avg = getUnweightedAverage(c);
		System.out.println("Unweighted average: " + avg);
		double wavg = getWeightedAverage(c);
		System.out.println("Weighted average: " + wavg);
		System.out.println("\n************************\n");

		String[] names2 = { "Reading", "Math", "AP US History" };
		double[] grades2 = { 90, 80, 85 };
		Double[] weights2 = { null, null, 1.2 };
		c = setup(names2, grades2, weights2);

		for (Course cor : c)
			System.out.println(cor);
		avg = getUnweightedAverage(c);
		System.out.println("Unweighted average: " + avg);
		wavg = getWeightedAverage(c);
		System.out.println("Weighted average: " + wavg);
	}

	public static Course[] setup(String[] s, double[] g, Double[] wts) {

		Course[] c = new Course[s.length];// creates an array of Course objects
		for (int i = 0; i < s.length; i++) {

			if (wts[i] == null) {

				c[i] = new Course(s[i]);// if it is not weighted then a course object is created
				c[i].setGrade(g[i]);// sets the grade for the object

			} else
				c[i] = new Weighted(wts[i], s[i]);// if the grade is weighted then creates a weighted object by sending
													// constructor values
			c[i].setGrade(g[i]);// sets the grade for the object

		}
		return c;// returns the array

	}

	public static double getUnweightedAverage(Course[] c) {
		double sum = 0.0;
		double count = 0.0;
		for (Course a : c) {

			sum += a.getGrade();// sums up the upweighted grades
			count++;// takes a count

		}
		return sum / count;// divides the sum by count to return an average
	}

	public static double getWeightedAverage(Course[] c) {
		double sum = 0.0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] instanceof Weighted == false) {
				sum += c[i].getGrade();// adds the sum of the unweighted grade

			} else {
				sum += ((Weighted) c[i]).getWeightedGrade();// adds the weighted grade

			}
		}
		return sum / c.length;// sends the average of both unweighted and weighted grades
	}
}
