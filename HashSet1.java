package Collex;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet hs=new HashSet<>();
	Employee12 e=new Employee12();
	Employee12 e1=new Employee12();
	hs.add(1322);
	hs.add(13313132);
	hs.add(1232332322);
	hs.add(111211322);
	hs.add(1333923222);
	hs.add(13323222);
	hs.add(13223372);
	hs.add(null);
	//hs.add();
	hs.add(e.toString());
	hs.add(e1);
	hs.add(1333212323);
	System.out.println(hs.size());
	Object b=hs.clone();
	System.out.println(b.hashCode());
	System.out.println(hs.hashCode());
	if(b.equals(hs)) {
		System.out.println("Objects are equal");
	}
	System.out.println(hs.clone());
	System.out.println(hs);
}
}
