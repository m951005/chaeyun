
public class ArrayEx3 {
	public static void main(String[] args) {
		String[] str = new String[3];
//		System.out.println(str[0]); // -> String의 기본값 null 출력
		str[0] = "Hello";
		str[1] = "World";
		str[2] = "안녕하세요";
		for(int i = 0; i < 3; i++) {
			System.out.println("str[" + i + "] : " +str[i]);
		}
		

	}

}
