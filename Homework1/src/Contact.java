public class Contact {

	protected String firstname;
	protected String lastname;
	private String cellnum;
	private String address;
	private String city;
	private String state;

	public Contact(String firstname, String lastname, String cellnum, String address, String city, String state) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.cellnum = cellnum;
		this.address = address;
		this.city = city;
		this.state = state;
		
	}
	public int compareTo(Contact o) {
		return this.firstname.compareTo(o.firstname);
   }
	public Contact(String firstname, String lastname, String cell) {

		this(firstname, lastname, cell, "N/A", "N/A", "N/A");
	}

	public void setFirst(String firstname) {     //setters
		this.firstname = firstname;
	}

	public void setLast(String lastname) {
		this.lastname = lastname;
	}

	public void setCell(String cellnum) {
		this.cellnum = cellnum;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFirst() {   //getters
		return this.firstname;
	}
	
	public String getLast() {			
		return this.lastname;
	}

	public String getCell() {
		return this.cellnum;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public void update(String first, String last, String cell, String address, String city, String state) {
		 {

			setFirst(first);
			setLast(last);																		//update the contacts
			setCell(cell);
			setAddress(address);
			setCity(city);
			setState(state);

		}
	}

	public boolean equals(Object obj) {
		return obj instanceof Contact ? true : false;

	}

	@Override
	public String toString() {
		return this.getFirst() + " " + getLast() + "\tPhoneNumber:" + getCell() + "\n" + getAddress() + "\n" + getCity()
				+ "," + getState();
	}
}

	/*public static void main(String[] args) {
		Contact contactobj = new Contact("John","Smith","5152378951","1882 51st Street","Brooklyn","New York"); //prints contact info
		System.out.println(contactobj + "\n");
		
		contactobj.update("Tom", "Doe", "7819514859", "312 Bleeker Street", "Oklahoma City", "Oklahoma");    //prints update info
		System.out.println(contactobj + "\n");
		
		
		Contact contactobj1 = new Contact("Joe","Rogen","1426589547","4103 2nd Avenue","New York","New York"); 
		System.out.println(contactobj1 + "\n");
		
		Contact contactobj2 = new Contact("Daisy","Yel","7489514586","50 East Ave","Louisana","New Orleans"); 
		System.out.println(contactobj2 + "\n");
		
		if (contactobj.compareTo(contactobj1) >= 1)															//comparing the contacts
			System.out.println("contactobj is greater than contactobj1 \n");
		else 
			System.out.println("contactobj is less than contactobj1 \n");
		
		if (contactobj1.compareTo(contactobj2) <= 1)
			System.out.println("contactobj1 is less than contactobj2 \n");
		else
			System.out.println("contactobj1 is greater than contactobj2 \n");
		
		if (contactobj.compareTo(contactobj1) == 1)
			System.out.println("contactobj is equal to contactobj1 \n");
		else 
			System.out.println("contactobj is not equal to contactobj1 \n");
	}
}*/