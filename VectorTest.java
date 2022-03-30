package Collex;
import java.util.ArrayList;
import java.util.Vector;
public class VectorTest {
public static void main(String[] args) {
	Vector<Integer> aa1=new Vector<>();
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
	aa1.add(90);//duplicate allowed
	//aa1.add(); null not allowed
	System.out.println(aa1.size());
	System.out.println(aa1);
	
}
}
