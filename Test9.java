public class Test9 {
	public static void main(String args[]) {
		char grade = 'H';
		
		switch(grade) {
		case 'A':
			System.out.println("优秀");
			break;
			
		case 'B':
		case 'C':	
			System.out.println("良好");
			break;
			
		case 'D':
			System.out.println("及格");
			break;
		
		case 'F':
			System.out.println("继续努力");
			break;
		default:
			System.out.println("未知等级");
		}System.out.println("你的等级是" + grade);
	}
}