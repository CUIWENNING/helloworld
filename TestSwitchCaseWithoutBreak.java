public class TestSwitchCaseWithoutBreak {
	public static void main (String[] args) {
		int grade = 120;
		
		switch( grade )
		{
		case 120 :
			System.out.println("大于100");
		case 100 :
			System.out.println("等于100");
		case 90:
			System.out.println("小于100");
		case 50:
			System.out.println("大于50");
		default:
			System.out.println("小于50");
			
		
		}
		System.out.println("钱是" + grade);
		
		
	}
}