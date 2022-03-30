package Collex;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudent {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		Student s=new Student(1,"Jyoti",new phone(832904,50000));
		Student s1=new Student(2,"Pallu",new phone(907531,10000));
		Student s2=new Student(3,"Dipali",new phone(87879,150000));
		Student s3=new Student(4,"Shreya",new phone(77095,20000));
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		for(Student ss:al) {
			
			if(ss.p.cost>=15000) {
				System.out.println(ss.id);
				System.out.println(ss.name);
				System.out.println(ss.p.mobNo);
				System.out.println(ss.p.cost);
			}
		
		}
	}
}
		
