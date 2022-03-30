package Collex;
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args) {
	ArrayList<Integer> aa1=new ArrayList<>();
	aa1.add(2);
	aa1.add(12);
	aa1.add(34);
	aa1.add(22);
	aa1.add(938);
	aa1.add(90);
	aa1.add(22);
	aa1.add(11);
	aa1.add(23);
	aa1.add(90);
	aa1.remove(5);
	//aa1.clear();
	System.out.println(aa1.set(2,25));
	System.out.println(aa1.isEmpty());
	System.out.println(aa1.hashCode());
	System.out.println(aa1.contains(aa1));
	System.out.println(aa1.stream());
	System.out.println(aa1.getClass());
	System.out.println(aa1.clone());
	System.out.println(aa1.size());
	System.out.println(aa1);
	
}
}
