package Collex;
import java.util.TreeMap;
public class TreeMapTest {
public static void main(String[] args) {
	TreeMap<Integer,String> trm=new TreeMap<>();
	trm.put(12,"Jyoti");
	trm.put(14,"Rahul");
	trm.put(18,"Yogesh");
	trm.put(19,"Dishant");
	trm.put(16,"Aniket");
	trm.put(100,"Jagdish");
	trm.put(120,"Prashant");
	trm.put(178,"Sushant");
	trm.put(157,"Vinayak");
	trm.put(190,"Akshay");
	System.out.println(trm.size());
	System.out.println(trm);
}
}
