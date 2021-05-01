package kodlamaio;

public class User {

	private int idNo;
	private String name;
	private String surname;
	private String emailAddress;
	private String password;
	
	public User() {
		
		
	}
	
	public User(int idNo, String name, String surname, String emailAddress, String password) {
		super();
		this.idNo = idNo;
		this.name = name;
		this.surname = surname;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
