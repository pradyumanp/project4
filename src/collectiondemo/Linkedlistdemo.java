package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		cities.add("london");
		cities.add("paris");
		cities.add(2, "new dilli");
		cities.add("mumbai");
		System.out.println(cities.size());
		Iterator itr = cities.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(cities.get(1));
		System.out.println(cities.contains("hyderabad"));
		
				
		
			
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
