package manager;

import java.util.*;
import java.io.*;
import vo.*;
import exception.*;

public class SchoolManager {
	private List<Person> persons = new ArrayList<>();
	private String fileName = "data.abc";
	private File file;
	private OutputStream os;
	private InputStream is;
	private BufferedOutputStream bos;
	private BufferedInputStream bis;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	// Save File
	public void saveFile() {
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
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//Load File
	public void loadFile() {
		try {
			file = new File(fileName);
			is = new FileInputStream(file);
			bis = new BufferedInputStream(is);
			ois = new ObjectInputStream(bis);
			
			persons = (List<Person>)ois.readObject();
			
		} catch (Exception e) {
			persons = new ArrayList<>();
			saveFile();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public SchoolManager() {
		loadFile();
	}
	
	//register
	public Person addPerson(Person p) throws DuplicateSsnException {
		try{
			findPerson(p.getSsn());
			throw new DuplicateSsnException("addPerson ERR");
		} catch (PersonNotFoundException e) {
			persons.add(p);
			saveFile();
			return p;
		}
	}
	
	//finder
	public Person findPerson(String ssn) throws PersonNotFoundException {
		for(Person p : persons) {
			if(p.getSsn().equals(ssn)) {
				return p;
			}
		}
		throw new PersonNotFoundException("Information is not found.");
	}
	
	//delete
	public boolean removePerson(String ssn) {
		try {
			if(findPerson(ssn) != null) {
				persons.remove(findPerson(ssn));
				saveFile();
				return true;
			}
			return false;
		} catch (PersonNotFoundException e) {
			return false;
		}
	}
	
	//print
	public List<Person> getAllPersons(){
		return persons;
	}

}
