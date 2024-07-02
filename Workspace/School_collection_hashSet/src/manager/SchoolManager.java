package manager;

import java.util.*;
import exception.DuplicateSsnException;
import exception.PersonNotFoundException;
import vo.*;

public class SchoolManager {
	private Set<Person> persons;
//	private Iterator<Person> iterator = persons.iterator();
	
	public SchoolManager() {
		persons = new HashSet<>();
	}
	
	public Person addPerson(Person p) throws DuplicateSsnException {
		// 동일한 주민번호가 있으면 등록하지 않게 처리
		try {
			findPerson(p.getSsn());				
			// 동일한 주민번호가 있으면 DuplicateSsnException 예외를 발생시킨다.
			throw new DuplicateSsnException(p.getSsn() 
					+ "과 동일한 주민번호가 있습니다.");
			
		} catch (PersonNotFoundException e1) {
			persons.add(p);
			return p;
		}
	}
	
	public Person findPerson(String ssn) throws PersonNotFoundException {
		Iterator<Person> iterator = persons.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getSsn().equals(ssn)) {
				return iterator.next();
			}
		}
		// 만약 주민번호에 해당하는 사람이 없으면 PersonNotFoundException을 발생 시킨다.
		throw new PersonNotFoundException(ssn 
				+ " 주민번호가 없습니다.");
	}
	
	public boolean removePerson(String ssn) {
		Iterator<Person> iterator = persons.iterator();
		try {
			if (findPerson(ssn) != null) {
				while(iterator.hasNext()) {
					if(iterator.next().getSsn().equals(ssn)) {
						persons.remove(iterator.next());
						return true;
					}
				}
			}
			return false;
		} catch (PersonNotFoundException e) {
			return false;
		}
	}
	
	public Set<Person> getAllPersons() {
		return persons;
	}
	
}