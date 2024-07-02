package manager;

import vo.*;

public class SchoolManager {
	private Person[] persons;
	private int count;
	
	public SchoolManager() {
		persons = new Person[100];
	}
	
	public Person addPerson(Person p) {
		// 동일한 주민번호가 있으면 등록하지 않게 처리
		if (findPerson(p.getSsn()) == null) {
			persons[count++] = p;
			return p;
		}
		return null;
	}
	
	public Person findPerson(String ssn) {
		for (int i = 0; i < count; i++) {
			if (persons[i].getSsn().equals(ssn)) {
				return persons[i]; 
			}
		}
		return null;
	}
	
	public boolean removePerson(String ssn) {
		if (findPerson(ssn) != null) {
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






