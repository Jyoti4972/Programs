package Collex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import Array.Phone;

public class HMSALStud {
public static void main(String[] args) {
	HashMap<String, ArrayList<Student_123>> hml=new HashMap<String,ArrayList<Student_123>>();
	
	ArrayList<Student_123> CSE=new ArrayList<Student_123>();
	Student_123 ss1=new Student_123(1,"Jyoti",new Phone1(1234,56474));
	Student_123 ss2=new Student_123(2,"Dipali",new Phone1(31234,5674));
	Student_123 ss3=new Student_123(3,"Akshay",new Phone1(131213,51111));
	
	CSE.add(ss1);
	CSE.add(ss2);
	CSE.add(ss3);
	hml.put("Computer", CSE);
	
	ArrayList<Student_123> MECH=new ArrayList<Student_123>();
	Student_123 ss4=new Student_123(1,"Arvi",new Phone1(12394,56474));
	Student_123 ss5=new Student_123(2,"Aarya",new Phone1(23499,56074));
	Student_123 ss6=new Student_123(3,"Arjun",new Phone1(1907673,888887));
	
	MECH.add(ss4);
	MECH.add(ss5);
	MECH.add(ss6);
	hml.put("Mechanical", MECH);
	
	System.out.println(hml);
	Set<String>dept=hml.keySet();
	
	for(String string:dept) {
		System.out.println();
		System.out.println("Key is>>"+string);
		System.out.println();
		ArrayList<Student_123> al=hml.get(string);
	for(Student_123 student:al) {
		System.out.println(student);
	}
	}
	
	}
}
