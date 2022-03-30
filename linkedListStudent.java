package Collex;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListStudent {

	public static void main(String[] args) {
		LinkedList<Stud> st=new LinkedList<>();
		Stud s1=new Stud(1,"Jyoti");
		Stud s2=new Stud(2,"Dipali");
		Stud s3=new Stud(3,"Samu");
		Stud s4=new Stud(4,"Pallu");
		Stud s5=new Stud(5,"Sanu");
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		System.out.println(st);
		for(Stud y:st) {
			System.out.println(y);
		}
		Iterator<Stud> itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
