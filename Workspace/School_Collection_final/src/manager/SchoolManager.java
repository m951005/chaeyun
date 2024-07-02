package manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exception.DuplicateSsnException;
import exception.PersonNotFoundException;
import vo.*;
import java.io.*;

public class SchoolManager {
	private List<Person> persons;
	private String fileName = "data.abc";
	private File file;
	private InputStream is;
	private OutputStream os;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private BufferedInputStream bis;
	private BufferedOutputStream bos;
	
	public void saveFile() {
		// 추가, 수정, 삭제 등이 발생할 때 persons의 내용을 파일로 저장
		try {
			file = new File(fileName);
			os = new FileOutputStream(file);
			bos = new BufferedOutputStream(os);
			oos = new ObjectOutputStream(bos);
			
			oos.writeObject(persons);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void loadFile() {
		// 프로그램을 시작하면 파일에서 persons의 내용을 불러온다.
		try {
			file = new File(fileName);
			is = new FileInputStream(file);
			bis = new BufferedInputStream(is);
			ois = new ObjectInputStream(bis);
			
			persons = (List<Person>) ois.readObject();
		} catch(Exception e) {
			persons = new ArrayList<>();
			saveFile();
		} finally {
			try {
				if (ois != null) ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public SchoolManager() {
		loadFile();
	}
	
	public Person addPerson(Person p) throws DuplicateSsnException {
		// 동일한 주민번호가 있으면 등록하지 않게 처리
		try {
			findPerson(p.getSsn());				
			// 동일한 주민번호가 있으면 DuplicateSsnException 예외를 발생시킨다.
			// 중복되는 주민번호가 없으면 배열에 저장한다.
			throw new DuplicateSsnException(p.getSsn() 
					+ "과 동일한 주민번호가 있습니다.");
			
		} catch (PersonNotFoundException e1) {
			persons.add(p);
			saveFile();
			return p;
		}
	}
	
	public Person findPerson(String ssn) throws PersonNotFoundException {
//		for (int i = 0; i < persons.size(); i++) {
//			if (persons.get(i).getSsn().equals(ssn)) {
//				return persons.get(i);
//			}
//		}
		
		// forEach
		/*
		 *	for (타입 변수명 : 순회가능한 객체) 
		 */
		for (Person person : persons) {
			if (person.getSsn().equals(ssn)) {
				return person;
			}
		}
		
		
		//return null;
		
		// 만약 주민번호에 해당하느 사람이 없으면 
		// PersonNotFoundException을 발생 시킨다.
		throw new PersonNotFoundException(ssn 
				+ " 주민번호가 없습니다.");
	}
	
	public boolean removePerson(String ssn) {
		try {
			if (findPerson(ssn) != null) {
//				for (int i = 0; i < persons.size(); i++) {
//					if (persons.get(i).getSsn().equals(ssn)) {
//						return persons.remove(persons.get(i));
//					}
//				}
				
				Iterator<Person> iterator = persons.iterator();
				while (iterator.hasNext()) {
					if (iterator.next().getSsn().equals(ssn)) {
						iterator.remove();
						saveFile();
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
		return persons;
	}
	
}
