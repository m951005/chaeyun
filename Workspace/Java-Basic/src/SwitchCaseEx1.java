public class SwitchCaseEx1 {
	public static void main(String[] args) {
		/* switch case문
		 * switch(조건식) {				<- 조건식은 정수, 문자열
		 *  case 값1: 조건식의 값이 case 값1과 같으면 실행될 문장...break;
		 *  case 값2: 조건식의 값이 case 값2과 같으면 실행될 문장...break;
		 *  case 값3: 조건식의 값이 case 값3과 같으면 실행될 문장...break;
		 *  default: 조건식의 값과 case 값이 모두 일치하지 않을 경우 실행될 문장...(옵션)
		 * }
		 */
		int a = 5;
		switch(a) {
		case 1: System.out.println("case 1 실행"); break;
		case 2: System.out.println("case 2 실행"); break;
		case 3: System.out.println("case 3 실행"); break;
		default: System.out.println("case에 해당하는 값이 없습니다.");
		}
		
	}

}
