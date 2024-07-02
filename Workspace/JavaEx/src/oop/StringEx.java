package oop;

public class StringEx {

	public static void main(String[] args) {
		char[] chArr = {'H', 'e', 'l', 'l', 'o'};
		String str1 = new String(chArr);
		System.out.println("str1: " + str1);
		
		String str2 = new String("Hello");
		System.out.println("str2: " + str2);
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같다.");
		} else {
			System.out.println("str1과 str2는 같지 않다.");
		}
		
		// charAt(int index): 문자열에서 index에 해당하는 문자를 리턴
		char ch1 = str1.charAt(4);
		System.out.println("ch1: " + ch1);
		
		// concat(String str): 문자열을 합쳐서 새로운 문자열을 리턴. 기존 문자열에 변경은 없음
		String str3 = "World";
		System.out.println(str1.concat(str3));
		
		// contains(CharSequence s): s 문자열 포함 여부 확인
		String s = "he";
		System.out.println(str1.contains(s));
		
		// equalsIgnoreCase(String s): 대소문자를 구분하지 않고 문자열을 비교
		s = "hello";
		System.out.println(str1.equals(s));
		System.out.println(str1.equalsIgnoreCase(s));
		
		// indexOf(String str): str에 해당하는 index 값을 리턴
		System.out.println(str1.indexOf("e"));
		
		// lastIndexOf(String str): str에 해당하는 마지막 index 값을 리턴
		System.out.println(str1.lastIndexOf("l"));
		
		// isEmpty(): 문자열의 길이가 0이면 true, 아니면 false
		String str4 = new String();
		System.out.println(str4.isEmpty());
		
		// length(): 문자열의 길이값 리턴
		System.out.println(str1.length());
		System.out.println(str4.length());
		
		// replace(CharSequence target, CharSequence replacement)
		// : target 문자열을 replacement 문자열로 교체
		String str5 = "HelloWorld";
		System.out.println(str5);
		System.out.println(str5.replace("World", "Java"));
		
		// split(String regex): regex 문자열을 기준으로 문자열을 잘라서 배열로 만들어서 리턴
		String str6 = "abc:def:ghi";
		String[] str6Arr = str6.split(":");
		for(int i = 0; i < str6Arr.length; i++) {
			System.out.println(str6Arr[i]);
		}
		System.out.println(str6Arr.length);
		
		// substring(int beginIndex): 문자열의 index 위치부터 마지막까지 문자열 값을 끊어서 새로운 문자열을 리턴
		System.out.println(str5);
		System.out.println(str5.substring(3));
		
		// substring(int beginIndex, int endIndex): 시작 인덱스부터 마지막 인덱스 -1까지 끊어서 새로운 문자열을 리턴
		System.out.println(str5.substring(5, 10));
		
		// toLowerCase(): 문자열 전체를 소문자로 변환
		System.out.println(str5.toLowerCase());
		
		// toUpperCase(): 문자열 전체를 대문자로 변환
		System.out.println(str5.toUpperCase());
		
		// trim(): 문자열의 좌우 공백을 제거
		String str7 = "  Hello World     ";
		System.out.println(str7);
		System.out.println(str7.trim());
		
		// valueOf(int i): i를 문자열로 반환
		int i = 10;
		String strI = String.valueOf(i);
		System.out.println(strI instanceof String);
	}

}
