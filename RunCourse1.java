
public class RunCourse1 {

	public static void main(String[] args) {

		Course c = new Course("Intro to Java");
		c.setGrade(92);
		System.out.println(c.getGrade());// 92.0
		System.out.println(c); // Intro to Java: 92.0
		Weighted w = new Weighted(1.2, "APCS");
		w.setGrade(88);
		System.out.println(w.getGrade()); // 88.0
		System.out.println(w.getWeightedGrade());// 105.6
		System.out.println(w);// APCS: 88.0, weighted: 105.6
		
		

	}

}
