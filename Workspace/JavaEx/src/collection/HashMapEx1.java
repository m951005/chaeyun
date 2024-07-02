package collection;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> hMap = new HashMap<>();
		
		// 엘리먼트 추가 (put)
		hMap.put("100", "홍길동");
		hMap.put("200", "김개똥");
		
		// 키로 엘리먼트 읽기 (get)
		System.out.println(hMap.get("100"));
		System.out.println(hMap.get("200"));
		System.out.println("size: " + hMap.size());
		
		hMap.put("200", "이말똥");				// K값은 중복 X(덮어씌어짐), V값은 중복가능
		System.out.println(hMap.get("200"));
		System.out.println("size: " + hMap.size());
		
		// 키값만 읽기
		Set<String> keys = hMap.keySet();
		for(String key : keys) {
			System.out.println(key + ", " + hMap.get(key));
		}
		
		// 값만 읽기
		Collection<String> valueList = hMap.values();
		for(String v : valueList) {
			System.out.println(v);
		}
		
		// 엘리먼트 삭제
		hMap.remove("100");
		System.out.println(hMap.get("100"));
		
	}

}
