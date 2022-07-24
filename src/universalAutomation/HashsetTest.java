package universalAutomation;

import java.util.HashSet;
import java.util.Set;

public class HashsetTest {

	public static void main(String[] args) {
		
		Set<String> hashset = new HashSet<String>();
		
		hashset.add("one");
		boolean s1 = hashset.add("12");
		boolean s2 = hashset.add("12");
		hashset.add("two");
//		System.out.println(s1);
//		
//		for(int i=0;i<hashset.size();i++) {
//			System.out.println(hashset);
//		}
		
		for(String item: hashset) {
			System.out.println(item);
		}
		
	}

}
