package collection;

import java.util.*;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

public class HashSetEx1 {

	public static void main(String[] args) {
		/*
		 * Set
		 * - 순서 보장 X
		 * - 중복 허용 X
		 */
		Set<Person> hSet = new HashSet<>();
		
		// 엘리먼트 추가
		Person p = new Person("홍길동", 25);
		hSet.add(p);
		hSet.add(new Person("김개똥", 30));
//		hSet.add(new Person("홍길동", 25));		중복으로 처리 X
		hSet.add(p);							// 동일한 인스턴스를 넣어도 size 늘어나지 않음. 중복처리
		
		// 사이즈 확인
		System.out.println(hSet.size());
		
		// 엘리먼트 삭제
//		hSet.remove(p);
		System.out.println(hSet.size());
		
		// 전체 출력
		Iterator<Person> iterator = hSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
