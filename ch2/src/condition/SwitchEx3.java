package condition;

public class SwitchEx3 {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			// case 를 나열해서 사용 가능하다.
			case 'A': case 'a':
				System.out.println("우수회원");
				break;
			case 'B': case 'b':
				System.out.println("일반회원");
				break;
			default :
				System.out.println("손님");
				break;
		}
	}
}
