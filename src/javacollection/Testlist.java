package javacollection;
import java.util.*;

public class Testlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> link=new LinkedList<>();
		
		link.add("gama");
		link.add("beta");
		link.add("hexa");
		link.add("delta");
		
		Iterator<String> itr = link.iterator();

		
		while (itr.hasNext()) {
		    String element = itr.next();
		    System.out.println(element);
		}

	}

}
