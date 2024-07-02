package collection;

import java.util.*;

public class ArraylistEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// 엘리먼트 추가 add()
		list.add(new String("홍길동"));
		list.add("김개똥");
		list.add(1, "이말똥");
		
		// 엘리먼트 읽기 get()
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		// 엘리먼트 삭제 remove()
		String removeEle = list.remove(1);			// 삭제된 엘리먼트를 return 받음
		System.out.println("remove: " + removeEle);
		boolean removeEle2 = list.remove("홍길동");	// 삭제가 되면 true, 안되면 false
		System.out.println("remove: " + removeEle2);
		
		// 리스트 내의 모든 엘리먼트 삭제 clear()
		list.clear();								// 엘리먼트만 삭제됨. list는 살아있음
		
		// 엘리먼트 전체 읽기 size()
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
