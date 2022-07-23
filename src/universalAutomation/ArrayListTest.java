package universalAutomation;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<Integer> arraylist = new ArrayList<Integer>(10);
		
		for(int i=0;i<10;i++) {
			arraylist.add(i);
		}
		
		System.out.println(arraylist);
		
		arraylist.add(10);
		
		System.out.println(arraylist);
		
		System.out.println(arraylist.get(10));
		
		System.out.println(arraylist.get(0));
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.print(arraylist.get(i) + " ");
			
		}
		
	}

}
