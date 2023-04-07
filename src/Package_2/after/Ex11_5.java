package Package_2.after;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

class Ex11_5 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
//		Map map = new HashMap();
//		map.put("1",1);
//		map.put("2",2);
//		map.put("3",3);
//		map.put("4",4);
//		map.put("5",5);
		
//		Collection c = new HashSet();
//		c.add("1");
//		c.add("2");
//		c.add("3");
//		c.add("4");
//		c.add("5");
		
//		Collection c = new TreeSet();
//		c.add("1");
//		c.add("2");
//		c.add("3");
//		c.add("4");
//		c.add("5");
		
		ArrayList c = new ArrayList();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");

//		Iterator it = map.entrySet().iterator();
		Iterator it = c.iterator();

//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}	
//		final int ss = map.size();
//		for(int j=0; j<ss; j++) {
//			Object obj = it.next();
//			System.out.println(obj);
			
		final int ss = c.size();
		for(int j=0; j<ss; j++) {
			Object obj = it.next();
			System.out.println(obj);	
		}
	} // main
}