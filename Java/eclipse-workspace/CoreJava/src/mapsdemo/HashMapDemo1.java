package mapsdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :2:45:14 PM
 *project : projCoreJava
 */

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(111, "John");
		hm.put(222, "Jim");
		hm.put(333, null);
		hm.put(null, "John");
		hm.put(null, "Jack");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getClass());
		}

	}

}
