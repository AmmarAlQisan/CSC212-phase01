package Phase01;

public class Contact implements Comparable<Contact> {

	private String name ;
	private String phoneNumber;
	private String emailAddress;
	private String address;
	private String birthday;
	private String notes;
	
	public Contact() {
		this.name = " ";
		this.phoneNumber = " ";
		this.emailAddress = " ";
		this.address = " ";
		this.birthday = " ";
		this.notes = " ";
	}
	public Contact(String name, String phoneNumber, String emailAddress, 
	   String address, String birthday,String notes) {
	    this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
    public boolean addEvent(Event x) {
	       return false;
}
    public boolean removeEvent(String TitleOfEvent ) {
	       return false;
    }
	@Override
	public String toString() {
		return "Contact [name = " + name + ", phoneNumber = " + phoneNumber + ", emailAddress = " + emailAddress
				+ ", address = " + address + ", birthday = " + birthday + ", notes = " + notes + "]";
	}
	@Override
	public int compareTo(Contact o) {
		  return (this.name.compareTo(o.name));
		
	}
}
