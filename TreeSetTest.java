package Collex;

import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<>();
	ts.add(4);
	ts.add(58);
	ts.add(42);
	ts.add(54);
	ts.add(44);
	ts.add(46);
	ts.add(48);
	ts.add(50);
	ts.add(52);
	
	ts.add(56);
	
	System.out.println(ts.size());
	System.out.println(ts.stream());
	System.out.println(ts);
}
}
