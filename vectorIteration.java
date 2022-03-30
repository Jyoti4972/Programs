package Collex;

import java.util.Iterator;
import java.util.Vector;

public class vectorIteration {

	public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	v.add(10);
	v.add(12);
	v.add(14);
	v.add(16);
	v.add(18);
	v.add(20);
	System.out.println(v);
	//for(int a:v) {
	//	System.out.println(a);
	//}
	Iterator<Integer> itr=v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
