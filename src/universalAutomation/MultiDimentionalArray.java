package universalAutomation;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int[][][] m = new int[4][4][4];

		
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
				for(int k=0;k<4;k++) {
					
					m[i][j][k]= i+j+k;
					System.out.print(" "+m[i][j][k]);
					
				}
				System.out.println();
				
			}
		}

	}

}
