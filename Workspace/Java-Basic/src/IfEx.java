
public class IfEx {
	public static void main(String[] args) {
		/* If문
		 * If(조건식{
		 *  조건식이 true일 경우 실행될 문장..
		 * }
		 * 
		 * if(조건식{
		 *	조건식이 true일 경우 실행될 문장..
		 * }else{
		 * 	조건식이 false일 경우 실행될 문장..
		 * }
		 * 
		 * if(조건식1{
		 * 	조건식1이 true일 경우 실행될 문장..
		 * }else if(조건식2){
		 * 	조건식1이 false이고 조건식2가 true일 경우 실행될 문자..
		 * }else if(조건식3) {
		 * 	조건식1과 조건식2가 false이고 조건식3이 true일 경우 실행될 문장..
		 * }else{
		 * 	모든 조건식이 false일 경우 실행될 문장..
		 * }
		 */
		
		int a = 5;
		System.out.println("if문 실행 전");
		if (a < 5) {							//중괄호없이 입력해도 문법상 오류x, but if문 바로 다음 문장만 실행됨.
			System.out.println("a : " + a);
			System.out.println("a는 5보다 작습니다.");
		}
		System.out.println("if문 실행 후");
		
		System.out.println("if else문 실행 전");
		if (a < 5 ) {
			System.out.println("a는 5보다 작습니다.");
		} else {
			System.out.println("a는 5보다 작지 않습니다.");
		}
		System.out.println("if else문 실행 후");
		
		System.out.println("if else문 실행 전");
		if (a < 5) {
			System.out.println("a는 5보다 작습니다.");
		} else if (a > 5) {
			System.out.println("a는 5보다 큽니다.");
		} else {
			System.out.println("a는 5와 같습니다.");
		}
		System.out.println("if else문 실행 후");
		
	}

}
