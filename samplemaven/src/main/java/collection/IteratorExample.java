package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Set <String> s=new HashSet <String>();
		
		s.add("black");
		s.add("blue");
		s.add("pink");
		
		System.out.println(s);
		
		//iterator object creation----iterator interface
		Iterator i=s.iterator();
		
		while(i.hasNext()) //hasNext() points to next element
		{
			System.out.println(i.next()); //next() prints an element
		}
		
		//removes last element of set
		i.remove();
		System.out.println(s);

	}

}
