
public class ClassEx2 {
	/*
	 * 변수의 종류
	 * 1) 전역변수(필드) : 메소드 밖에 선언되어 사용하는 변수, class의 생명이 끝나면 삭제
	 * 2) 지역변수(매개변수) : 메소드 내에서 선언되어 사용하는 변수. 메소드 종료 시 삭제
	 * 3) 정적(static)변수 : static 키워드가 붙은 변수 = class변수
	 * 
	 * static : 클래스 로딩 시점에 자동으로 메모리에 올라간다. -> 생성자 호출 필요X
	 * 소스코드 -> 컴파일 -> 바이트코드 -> 실행 -> JVM
	 * non-static : 객체로 생성되면 메모리에 올라간다.
	 */
	int a = 5;								//전역변수 -> 여러 메소드에서 사용가능
	static String s = "Hello";

	public static void main(String[] args) {
		ClassEx2 classEx2 = new ClassEx2();			// new~ 생성자 호출
		System.out.println("main() 메소드의 a : " + classEx2.a);	//참조변수
		classEx2.method1();
		System.out.println("method1() 실행 후");
		System.out.println("main() 메소드의 a : " + classEx2.a);
		System.out.println("main() 메소드의 s : " + s);
	}
	
	public void method1() {
		int a = 10;											//같은 이름의 전역변수와 지역변수가 있을 시 지역변수를 먼저 참조함
		System.out.println("method1() 메소드의 a : " + a);		//전역변수 출력을 원하면 this.으로 참조
		a = 1;												//전역변수에 영향XX
		System.out.println("method1() 메소드의 s : " + s);
	}

}
//같은 영역에 있는 메소드, 변수들 -> 멤버
