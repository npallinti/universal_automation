package universalAutomation;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList <String> list =  new LinkedList<String>();
			
		list.add("cucumber");
		
		list.add("tamatoes");
		
		list.add("raddish");
	
		list.add(2,"cabbage");
			
		list.addFirst("brinjal");
		
		list.addLast("drumstick");
		
		list.removeFirst();
		
		list.remove(1);
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
