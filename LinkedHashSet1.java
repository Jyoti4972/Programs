package Collex;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
	LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
	lhs.add(6266);
	lhs.add(237432);
	lhs.add(8239480);
	lhs.add(23656523);
	lhs.add(388812);
	lhs.add(162367631);
	lhs.add(2121212112);
	lhs.add(13237);
	lhs.add(21221);
	System.out.println(lhs.size());
	System.out.println(lhs.stream());
	System.out.println(lhs);
}
}