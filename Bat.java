package Sabir_U8Programs;
/**
 * 
 * Name: Yaseer Sabir
 * Title: Bat
 * 
 */
public class Bat implements Comparable{// here we are implementing the Comparable interface

	private int n;

	public Bat(int n) {
		this.n = n;
	}

	public String toString() {
		return "bat " + n;
	}
	
	@Override
	public int compareTo(Object o) {// overriding the compareTo method
		
		if( this.n > ((Bat)o).n)// casting is needed to check for values
			return 1;
		else
			return -1;
		
		
	}

	

}
