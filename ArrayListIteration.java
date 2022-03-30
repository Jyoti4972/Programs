package Collex;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(01);
		al.add(12);
		al.add(14);
		al.add(16);
		al.add(18);
		al.add(20);
		al.add(20);//duplicates allowed
		al.add(null);
		//al.add();//not allowed
		System.out.println(al);
		/*for(int y:al) {
			System.out.println(y);
		}*/
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			int y=itr.next();
			System.out.println(y);
		}
	}
	String str="866";

}
