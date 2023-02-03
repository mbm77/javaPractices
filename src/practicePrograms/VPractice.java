package practicePrograms;

import java.util.*;

//Vector
public class VPractice {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		
		//add
		v1.add("mbm");
		v1.add("yadagiri");
		v1.add(0, "jeevan");
		
		//System.out.println(v1);

		Vector v2 = new Vector();
		v2.add("ramesh");
		v2.add("suresh");
		v2.add("jeevan");
		
//		for(int i=0; i<v2.size(); i++) {
//			v1.add(v2.get(i));
//		}
		
		//v1.addAll(v2);
		v1.addAll(0, v2);
		//System.out.println(v1);
		//System.out.println(v1.size());
		//System.out.println(v1.capacity());
		
		//get
		//System.out.println(v1.get(2));
		
		//remove
		//v1.remove(0);
		//v1.remove("jeevan");
		//v1.removeAll(v2);
		//v1.clear();
		Vector v3 = new Vector();
		v3.add("suresh");
		v3.add("ramesh");
		
		//verify
		//System.out.println(v1.contains("mbm"));
		//System.out.println(v1.containsAll(v3));
		
		//update
		v1.set(1, "Sateesh");
		//System.out.println(v1);
		
		//indexOf
		//System.out.println(v1.indexOf("jeevan"));
		//System.out.println(v1.lastIndexOf("jeevan"));
		
		//Object[] arr = v1.toArray();
		//System.out.println(Arrays.toString(arr));
		
		//custom vector size
		Object[] arr = new Object[] {1, 5, 8, 9, 2};
		Vector v4 = new Vector(Arrays.asList(arr));
//		System.out.println(v4.size());
//		System.out.println(v4.capacity());
		
		//generics
		Vector<Integer> v5 = new Vector<>();
		v5.add(12);
		v5.add(56);
		v5.add(null);
		v5.add(12);
		System.out.println(v5.size());
		System.out.println(v5.capacity());
		
	}

}
