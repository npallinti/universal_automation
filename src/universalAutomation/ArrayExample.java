package universalAutomation;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] array1 = {10,20,30,40,450};
		
		System.out.println(array1[array1.length-1]);
		
		String message = "I world green world";
		
		String[] msg = message.split(" ");
		
		System.out.println("this first word is " +msg[0]);
		System.out.println(msg[0]);
		
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}

	}

}
