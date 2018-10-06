import java.util.*;

public class ContactList implements Iterable<Contact> {
	private ArrayList<Contact> CL;

	public Iterator<Contact> iterator() {
		return CL.iterator();
	}

	public ContactList() {
		CL = new ArrayList<Contact>();
	}

	public ContactList(Contact[] contacts) {
		this();
		for (int i = 0; i < contacts.length; i++)
			CL.add(contacts[i]);
	}

	public Contact searchLN(String last) { // search contact by last name
		for (int i = 0; i < CL.size(); i++)
			if (CL.get(i).getLast().equals(last))
				return CL.get(i);
		return null;
	}

	public Contact searchNum(String phone) { // search contact by phone number
		for (int i = 0; i < CL.size(); i++)
			if (CL.get(i).getLast().equals(phone))
				return CL.get(i);
		return null;
	}

	public ArrayList<Contact> sameletterLN(String sameln) { // search and returns contact list containing all contacts
															// with a
		// last name starting with a certain letter
		ArrayList<Contact> CL2 = new ArrayList<>();
		for (int i = 0; i < CL.size(); i++) {
			if (sameln.charAt(0) == CL.get(i).getLast().charAt(0))
				CL2.add(CL.get(i));
		}
		if (CL2.isEmpty())
			return null;
		return CL2;

	}

	public ArrayList<Contact> sameCity(String city) { // search and returns contact list containing all contacts with a
														// last name
		// starting with a certain city
		ArrayList<Contact> CL2 = new ArrayList<>();
		for (int i = 0; i < CL.size(); i++) {
			if (city.charAt(0) == CL.get(i).getLast().charAt(0))

				CL2.add(CL.get(i));
		}
		if (CL2.isEmpty())
			return null;
		return CL2;
	}

	public void Add(Contact New) { // Add new Contact
		if (!CL.contains(New))
			CL.add(New);
	}

	public int Size() { // returns size of Contact List
		return CL.size();
	}

	public void Remove(Contact rc) { // remove contact from contact list
		if (CL.contains(rc))
			CL.remove(rc);
		else
			System.out.println("Contact does not exist");
	}

	public Contact Index(int index) throws IndexOutOfBoundsException { // get contact from contact list by index
		if (index > CL.size())
			throw new IndexOutOfBoundsException();
		return CL.get(index);
	}

	public boolean equals(ArrayList<ContactList> c) {
		return (c.contains(CL));
	}

	public String toString(ArrayList<Contact> c) {
		StringBuilder s = new StringBuilder();
		int i = 0;
		while (c.iterator().hasNext()) {
			s.append(c.get(i).toString());
		}
		return s.toString();
	}

}
