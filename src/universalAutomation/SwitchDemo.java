package universalAutomation;

public class SwitchDemo {

	public static void main(String[] args) {
		int month = 1;
		
		String monthstr;
		
		switch(month){
		
		case 1 :
			
			monthstr = "Jan";
			break;
			
		case 2 :
			
			monthstr = "Feb";
			break;
			
		case 3 :
			
			monthstr = "Mar";
			break;
			
		case 4 :
			
			monthstr = "Apr";
			break;
			
		case 5 :
			
			monthstr = "May";
			break;
			
		case 6 :
			
			monthstr = "Jun";
			break;
			
		case 7 :
			
			monthstr = "Jul";
			break;
			
		case 8 :
			
			monthstr = "Aug";
			break;
			
		case 9 :
			
			monthstr = "Sep";
			break;
			
		case 10 :
			
			monthstr = "Oct";
			break;
			
		case 11 :
			
			monthstr = "Nov";
			break;
			
		case 12 :
			
			monthstr = "Dec";
			break;
			
		default :
			monthstr = "Invalid month";
			break;
		
		}
		
		System.out.println(monthstr);
		
	}

}
