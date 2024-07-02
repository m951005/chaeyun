package collection;

import java.util.*;

class MemberIndex {
	private static long index;
	
	public static long makeIndex() {
		return ++index;
	}
}
class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", age: " + age;
	}
}

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<Long, Member> members = new HashMap<>();
		members.put(MemberIndex.makeIndex(), new Member("홍길동", 25));
		members.put(MemberIndex.makeIndex(), new Member("김개똥", 28));
		members.put(MemberIndex.makeIndex(), new Member("이말똥", 19));
		
		// 사이즈 확인
		System.out.println(members.size());
		
		Set<Long> keys = members.keySet();
		for(Long key : keys) {
			System.out.print(key + ". ");
			System.out.println(members.get(key));
		}

	}

}
