public class Test10 {
	public static void main(String args[]) {
		char grade = 'D';
		
		switch(grade) {
		case 'A':
			System.out.println("优秀");
			
			
		case 'B':
		case 'C':	
			System.out.println("良好");
			
			
		case 'D':
			System.out.println("及格");
			
		
		case 'F':
			System.out.println("继续努力");
			
		default:
			System.out.println("default");
		}
	}
}