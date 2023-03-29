package linked.org;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise03 {
public static void main(String[] args) {
	HashMap<Integer, Integer>a=new HashMap<Integer, Integer>();
	a.put(0, 1);
	a.put(1, 2);
	a.put(2, 3);
	a.put(3, 3);
	
	for (Map.Entry x  : a.entrySet()) {
		System.out.println(x.getKey()+" "+x.getValue());
	}	
	
	System.out.println("size of the hashmap");
	System.out.println(a.size());
	
	HashMap<Integer, Integer>b=new HashMap<Integer, Integer>();
	b=(HashMap)a.clone();
	for (Map.Entry y  : b.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
	
	a.clear();
	if (a.isEmpty()) {
		System.out.println("true");
	}
	HashMap<Integer, Integer>c=new HashMap<Integer, Integer>();
	c.put(4, 10);
	c.put(5, 11);
	c.put(6, 12);
	
	
	c.putAll(b);
	System.out.println(c);
	
	System.out.println(b.containsKey(0)+" "+b.get(0));
	
	if (b.containsValue(4)) {
		System.out.println("Value is present");
		
	}
	else {
		System.out.println("no value");
	}
	
	
	System.out.println(c.get(4));
	
	
}
}

