package manager;

import java.util.*;
import exception.DuplicateSsnException;
import exception.PersonNotFoundException;
import vo.*;

public class SchoolManager {
	private List<Person> persons;
	
	public SchoolManager() {
		persons = new ArrayList<>();
	}
	
	public Person addPerson(Person p) throws DuplicateSsnException {
		// 동일한 주민번호가 있으면 등록하지 않게 처리
		try {
			findPerson(p.getSsn());				
			// 동일한 주민번호가 있으면 DuplicateSsnException 예외를 발생시킨다.
			throw new DuplicateSsnException(p.getSsn() 
					+ "과 동일한 주민번호가 있습니다.");
			
		} catch (PersonNotFoundException e1) {
//			persons[count++] = p;
			persons.add(p);
			return p;
		}
	}
	
	public Person findPerson(String ssn) throws PersonNotFoundException {
		// foreach 문법
		/* : list 내의 객체들을 size만큼 돌아가면서 선언된 변수에 넣어주는 문법
		 * for (Person p : persons){
		 * 		...
		 * }
		 */
		for (Person p : persons) {
			if(p.getSsn().equals(ssn)) {
				return p;
			}
		}
		// 만약 주민번호에 해당하는 사람이 없으면 PersonNotFoundException을 발생 시킨다.
		throw new PersonNotFoundException(ssn 
				+ " 주민번호가 없습니다.");
	}
	
	public boolean removePerson(String ssn) {
		try {
			if (findPerson(ssn) != null) {
				for(Person p : persons) {
					if(p.getSsn().equals(ssn)) {
						persons.remove(p);
						return true;
					}
				}
			}
			return false;
		} catch (PersonNotFoundException e) {
			return false;
		}
	}
	
	public List<Person> getAllPersons() {
//		List<Person> result = new ArrayList<>();
		return persons;
	}
	
}