package collectiondemo;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<String> cities= new ArrayList<>();
		cities.add("london");
		cities.add("paris");
		cities.add(2, "new dilli");
		cities.add("mumbai");
		System.out.println(cities.size());
		for(String t: cities)
		{
			System.out.println(t);
		}
			//KKK
		
		
				
		// TODO Auto-generated method stub

	}

}
