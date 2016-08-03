package mydev;

public class Contact {
	
	private String name;
	private String phoneNumber;
	private String email;
	private String memo;
	
	public Contact(String name, String phoneNumber, String email, String memo) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.memo = memo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String toString(){
		return "Name: "+getName()+" Phone: "+getPhoneNumber()+
				" Email: "+getEmail()+" Memo: "+getMemo();
	}
}
