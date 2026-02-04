package javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Links {

	public static void main(String []args) {
		
		LinkedList<Integer> lk= new LinkedList<>();
		
		
		lk.add(123);
		lk.addLast(456);
		lk.add(234);
		lk.addFirst(1);
		lk.add(345);
		
		System.out.println(lk.getFirst());
		
		lk.removeFirst();
		
		
		Iterator<Integer> it=lk.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+", ");
		}
		
		
	}
}
