package Sabir_U8Programs;
import java.util.*;

public class Check {

	public static void main(String[] args) {
		
		List<Integer> b = new LinkedList<Integer>();
		
		//System.out.println(b.size());
		 
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		ArrayList<String> list = new ArrayList<String>();
	    
		
	    for(int i =0; i<a.size();i++){
	        list.add(a.get(i));
	    }
	    for(int i = a.size()-1; i>=0;i--){
	        list.add(a.get(i));
	    }
	    
	    System.out.println(list);
	}

}
