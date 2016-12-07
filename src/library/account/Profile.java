package library.account;

import java.util.Scanner;

public class Profile {
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String homeAddress;
	private String city;
	private int homeNumber;
	private String phoneNumber;
	private int passCode;

	public Profile(String firstName, String lastName, String email,
			String dateOfBirth, String homeAddress, String city,
			int homeNumber, String phoneNumber, int passCode) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.city = city;
		this.homeNumber = homeNumber;
		this.phoneNumber = phoneNumber;
		this.passCode = passCode; 
	}
	
	public Profile()  {
	}

	public void showAccountInfo() {
		System.out.println("Your name is: " + firstName + " " + lastName);
		System.out.println("Date of birth: " + dateOfBirth);
		System.out.println("Contact:");
		System.out.println("E-mail address: " + email);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Home address: " + homeAddress + ", " + homeNumber
				+ ". " + city);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPassCode() {
		return passCode;
	}

	public void setPassCode(int passCode) {
		this.passCode = passCode;
	}

	public Profile enterProfileInformation() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the following information: ");
		
		System.out.println("first name: ");
		this.setFirstName(scan.nextLine());
		
		System.out.println("last name: ");
		this.setLastName(scan.nextLine());
		
		System.out.println("Please enter your date of birth (dd.mm.yyyy): ");
		this.setDateOfBirth(scan.nextLine());
		
		System.out.println("Please enter your contact information");
		System.out.println("your E-mail address: ");
		this.setEmail(scan.nextLine());
		
		System.out.println("your phone number: ");
		this.setPhoneNumber(scan.nextLine());
		
		System.out.println("enter a personal passcode (3 numbers)");
		this.setPassCode(scan.nextInt());
		
		scan.close();
		
//		this.showAccountInfo();
		
		return this;
		}

	
}
