public class TestSwitchCase {
	public static void main (String[] args) {
		char grade = 'A';
		
		switch(grade) 
		{
		case 'A' :
			System.out.println("优秀");
			break;
		case 'B' :
			System.out.println("优秀");
			break;
		case 'C':
			System.out.println("良");
			break;
		case 'D':
			System.out.println("ok");
			break;
		default:
			System.out.println("未知等级"); 
			
		
		}
		System.out.println("等级是" + grade);
		
		
	}
}