package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List <String> L=new ArrayList <String>();
		
		//add()
		L.add("green");
		L.add("blue");
		L.add("white");
		L.add("blue");
		System.out.println(L);
		
		//get()
		System.out.println(L.get(2));
		
		//set()
		L.set(2, "red");
		System.out.println(L);
		
		//indexOf()
		System.out.println(L.indexOf("blue"));
		
		//lastIndexOf()
		System.out.println(L.lastIndexOf("blue"));
		
		//remove()
		L.remove("blue");
		System.out.println(L);
		
		//contains()
		System.out.println(L.contains("green"));
		
		//isEmpty()
		System.out.println(L.isEmpty());
		
		//size()
		System.out.println(L.size());
		
	
	}

}
