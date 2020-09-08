package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StreamAPI {


	//Using foreach in Java 8
	public static void main(String[]args) {

		Map<Integer,String> customers = new HashMap<>();
		customers.put(1,"abc");
		customers.put(2,"xyz");
		customers.put(3,"test");

		customers.forEach((id,name) -> {System.out.println("Key : "+id+"value :"+name);});
		
		
		//Using entrySet()
		
		for(Map.Entry<Integer, String> entry : customers.entrySet()) {
			System.out.println("key:" +entry.getKey() + "value:" +entry.getValue());
		}
		
		//Using iterator through the KeySet()
		
		Iterator<Integer> iterator = customers.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("key:"+key+"value:"+customers.get(key));
			
		}
		
		//Using steam api
		customers.entrySet().stream().forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
	
		

	}
	
	
}
