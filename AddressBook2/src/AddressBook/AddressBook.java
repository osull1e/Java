package AddressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric O'Sullivan
 * @date 3/3/16
 * @project 3: Address Book
 */
public class AddressBook {
	// add, delete, search, also compare two individuals
	List<Person> ab = new ArrayList<Person>();

	public void add(Person p) {
		ab.add(p);
	}

	public void delete(int N){
		ab.remove(N);
	}

	public Person search(int id) {
		for (Person p : ab) {
			if (p.getID() == id) {
				return p;
			}
		}

		return null;
	}

	public int getLastID() {
		Person p;
		p = ab.get(ab.size() - 1);
		return p.getID();
	}

	public static int search(String[] list, String fName) // method to find
															// "Jones"
	{
		int i, count = 0;
		for (i = 0; i < list.length; i++) {
			if (list[i].equals(fName))
				count = count + 1;
		}
		return (count);
	}


	public int searchId(int num){
		int retval = -1;
		for(int i = 0; i < (ab.size()); i++){
			if(ab.get(i).getID()== num);
			retval = i;
		}
		return retval;
	}
	
	public String toString() {
		StringBuilder allPeople = new StringBuilder();
		for (Person p : ab) {
			allPeople.append(p.toString() + "\n");
		}

		return allPeople.toString();
	}
}
