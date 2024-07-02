package ui;

import java.util.*;

import exception.DuplicateSsnException;
import exception.PersonNotFoundException;
import manager.SchoolManager;
import vo.*;

public class SchoolUI{
	private Scanner sc = new Scanner(System.in);
	private SchoolManager manager = new SchoolManager();
	
	public SchoolUI() {
		boolean flag = true;
		while(flag) {
			flag = showMain();
		}
		System.out.println("The program will exit.");
	}
	
	public boolean showMain() {
		try {
			System.out.println("1. Registration");
			System.out.println("2. Search");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Printing All");
			System.out.println("6. Quit");
			System.out.print("Select >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1: regiPerson(); break;
			case 2: searchPerson(); break;
			case 3: updatePerson(); break;
			case 4: deletePerson(); break;
			case 5: printingAll(); break;
			case 6: return false;
			default: System.err.println("Please enter again.");
			}
		} catch (Exception e) {
			System.err.println("Please enter the number btw 1 ~ 6.");
			sc.nextLine();
			return true;
		}
		return true;
	}
	
	public void regiPerson() {
		Person p = null;
		
		try {
			System.out.println("1. Student");
			System.out.println("2. Teacher");
			System.out.println("3. Staff");
			System.out.print("Select >> ");
			int select = sc.nextInt();
			if(select > 0 && select < 4) {
				System.out.print("NAME : ");
				String name = sc.next();
				System.out.print("SSN : ");
				String ssn = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();
				switch(select) {
				case 1:
					System.out.print("Student NO : ");
					String stdNo = sc.next();
					p = manager.addPerson(new Student(name, ssn, age, stdNo));
					break;
				case 2:
					System.out.print("Major : ");
					String major = sc.next();
					p = manager.addPerson(new Teacher(name, ssn, age, major));
					break;
				case 3:
					System.out.print("Department : ");
					String dept = sc.next();
					p = manager.addPerson(new Staff(name, ssn, age, dept));
					break;
				}
				System.out.println("Success!");
			} else {
				System.err.println("Please enter again.");
			}
		} catch (DuplicateSsnException de) {
			System.out.println("Duplicate information found.");
		} catch (Exception e) {
			System.err.println("Please enter in numeric form.");
			sc.nextLine();
		}
	}
	
	public Person searchPerson() {
		System.out.print("Enter SSN : ");
		String ssn = sc.next();
		try {
			Person p = manager.findPerson(ssn);
			System.out.println("Result >> " + p);
			return p;
		} catch (PersonNotFoundException e) {
			e.getMessage();
			return null;
		}
	}
	
	public void updatePerson() {
		Person p = searchPerson();
		if(p != null) {
			System.out.print("New Name : ");
			p.setName(sc.next());
			System.out.print("New Age : ");
			p.setAge(sc.nextInt());
			if(p instanceof Student) {
				System.out.print("New Student Number : ");
				((Student)p).setStdNo(sc.next());
			} else if (p instanceof Teacher) {
				System.out.print("New Major : ");
				((Teacher)p).setMajor(sc.next());
			} else if (p instanceof Staff) {
				System.out.print("New Department : ");
				((Staff)p).setDept(sc.next());
			}
		}
		manager.saveFile();
		System.out.println("Update Success!");
	}
	
	public void deletePerson() {
		System.out.print("Enter SSN for Delete : ");
		String ssn = sc.next();
		if(manager.removePerson(ssn)) {
			System.out.println("Deleted!");
		} else {
			System.err.println("Information not found.");
		}
	}
	
	public void printingAll() {
		List<Person> result = manager.getAllPersons();
		for(Person p : result) {
			System.out.println(p);
		}
	}
}