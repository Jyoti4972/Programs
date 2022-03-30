package Collex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMapIteration {
	public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(1,"India");
	hm.put(2,"USA");
	hm.put(3,"China");
	hm.put(4,"England");
	hm.put(5,"Brazil");
	hm.put(6,"Bangladesh");
	hm.put(7,"Dubai");
	hm.put(8, "Kenia");
	hm.put(9, "NewZland");
	hm.put(10,"Canada");
	System.out.println(hm.size());
	System.out.println(hm);
	Set<Integer> keys=hm.keySet();
	for(int key:keys) {
		System.out.println(key);
		String val=hm.get(keys);
		System.out.println(val);
		
	}
}
}