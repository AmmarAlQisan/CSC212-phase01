package Phase01;

public class Contact implements Comparable<Contact> {

	public String name ;
	public String phoneNumber;
	public String emailAddress;
	public String address;
	public String birthday;
	public String notes;
	
	
	
	
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



// constructor
	
	public Contact(String name, String phoneNumber, String emailAddress, 
			String address, String birthday,String notes) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}




	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
}
