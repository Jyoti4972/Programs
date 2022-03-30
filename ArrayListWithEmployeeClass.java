package Collex;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListWithEmployeeClass {

	public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<>();
	Employee E=new  Employee(1,"Kiran");
	Employee E1=new  Employee(2,"Jyoti");
	Employee E2=new  Employee(3,"Rutuja");
	Employee E4=new  Employee(4,"Pooja");
	Employee E5=new  Employee(5,"Snehal");
	al.add(E);
	al.add(E1);
	al.add(E2);
	al.add(E4);
	al.add(E5);
	for( Employee employee:al) {
		System.out.println("Age>>"+employee.id);
		System.out.println("Name>>"+employee.name);
		System.out.println("___________________________________________");
	}
	System.out.println("- - - - - -  - - - - - - - - - - - - - -  - - - " );
	Iterator<Employee> itr=al.iterator();
	while(itr.hasNext()) {
		Employee EE=itr.next();
		System.out.println(EE);
		System.out.println("___________________________________________");
	}

}
}
