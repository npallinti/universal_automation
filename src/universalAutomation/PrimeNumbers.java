package universalAutomation;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		boolean flag = true;
		
		for(int i = 1;i<num.length;i++) {
			System.out.println("number = "+num[i]);
			int prime = num[i]%i;
			
			System.out.println("prime number = "+prime);
		}

	}

}
