package manager;

import vo.*;

// SchoolManager : 비즈니스 로직을 수행하는 클래스, Person의 정보를 배열로 저장
public class SchoolManager {
	
	private Person[] persons;
	private int count;
	
	public SchoolManager() {
		persons = new Person[100];
	}
	
	public Person addPerson(Person p) {
		// 동일한 주민번호가 있으면 등록하지 않게 처리
			if(findPerson(p.getSsn()) != null) {
				return null;
			}
		return persons[count++] = p;
	}
	
	public Person findPerson(String ssn) {
		for(int i = 0; i < count; i++) {
			if(persons[i].getSsn().equals(ssn)) {
				return persons[i];
			}
		}
		return null;
	}
	
	public boolean removePerson(String ssn) {
		if(findPerson(ssn) != null) {
			for(int i = 0; i < count; i++) {
				if(persons[i].getSsn().equals(ssn)) {
					for(int j = i; j < count; j++) {
						if(j == count-1) {
							persons[j] = null;
						} else {
							persons[j] = persons[j+1];
						}
					}
					count--;
					return true;
				}
			}
		}
		return false;
	}
	
	public Person[] getAllPersons() {
		for(int i = 0; i < count; i++) {
			System.out.println(persons[i].toString());
		}
		return null;
	}
}
