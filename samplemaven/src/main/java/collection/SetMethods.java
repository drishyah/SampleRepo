package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		
		Set <String> s=new HashSet <String>();
		Set <String> s1=new HashSet <String>();
		
		//add()
		s.add("white");
		s.add("blue");
		s.add("black");
		s.add("red");
		System.out.println(s);
		
		s1.add("apple");
		s1.add("orange");
		
		
		//addAll()
		s.addAll(s1);
		System.out.println(s);
		
		//contains()
		System.out.println(s.contains("orange"));
		System.out.println(s1.contains("black"));
		
		//containsAll()
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		
		//isEmpty()
		System.out.println(s.isEmpty());
		
		//remove()
		s1.remove("orange");
		System.out.println(s1);
		
		//removeAll()
		s.removeAll(s1);
		System.out.println(s);
		
		//size()
		System.out.println(s.size());
		
		//clear()
		s1.clear();
		System.out.println(s1);	
	}

}
