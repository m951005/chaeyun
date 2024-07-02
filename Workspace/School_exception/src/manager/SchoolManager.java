package manager;

import exception.*;
import vo.Person;

public class SchoolManager {
	private Person[] persons;
	private int count;
	
	public SchoolManager() {
		persons = new Person[100];
	}
	
	public Person addPerson(Person p) throws DuplicateSsnException {
		// 동일한 주민번호가 있으면 등록하지 않게 처리
//		if (findPerson(p.getSsn()) == null) {
//			persons[count++] = p;
//			return p;
//		}
//		return null;
		
		try {
			findPerson(p.getSsn());
			// 동일한 주민번호가 있으면 DuplicateSsnException 예외를 발생시킨다.
			throw new DuplicateSsnException("이미 등록된 주민번호 입니다.");
			
		} catch (PersonNotFoundException pe) {
			// 중복되는 주민번호가 없으면 배열에 저장한다.
			persons[count++] = p;
			return p;
		}
	}
	
	public Person findPerson(String ssn) throws PersonNotFoundException {
		for (int i = 0; i < count; i++) {
			if (persons[i].getSsn().equals(ssn)) {
				return persons[i]; 
			}
		}
//		return null;
		
		// 만약 주민번호에 해당하는 사람이 없으면
		// PersonNotFoundException 예외를 발생시킨다.
		throw new PersonNotFoundException(ssn + " 주민번호가 없습니다.");
	}
	
	public boolean removePerson(String ssn) {
		try {
			findPerson(ssn);
			for (int i = 0; i < count; i++) {
				if (persons[i].getSsn().equals(ssn)) {
					for (int j = i; j < count; j++) {
						if (j == count - 1) {
							persons[j] = null;
						} else {
							persons[j] = persons[j + 1];
						}
					}
						count--;
						return true;
				}
			}
			
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}
	
	public Person[] getAllPersons() {
		Person[] result = new Person[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = persons[i];
		}
		
		return result;
	}
	
}






