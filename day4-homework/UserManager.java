package kodlamaio;

public class UserManager {
	
	public UserManager() {
		
	}
	
	public void register(User user) {
		System.out.println(user.getName() + ", registered to the system.");
		System.out.println();
	}
	
	public void deleteAccount(User user) {
		System.out.println("User " + user.getName() + " " + user.getSurname() + " (" + user.getIdNo() + ")" + ", deleted from the system.");
		System.out.println();
	}
	
	public void displayInfo(User user) {
		
		System.out.println("Name: " + user.getName());
		System.out.println("Surname: " + user.getSurname());
		System.out.println("E-mail Address: " + user.getEmailAddress());
		
	}

}
