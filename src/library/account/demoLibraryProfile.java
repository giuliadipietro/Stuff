package library.account;
import java.util.ArrayList;
import java.util.List;

import library.account.Profile; 

public class demoLibraryProfile {

	public static void main(String[] args) {
		
	Profile hello = new Profile();

	hello.enterProfileInformation();
	
	List<Profile> profileList = new ArrayList<>();
	profileList.add(hello);
	
	System.out.println("This is from the list "+profileList.get(0).getLastName());
	}
//	System.out.println("Write a passphrase");
//	if(hello.getPass() == thethingyouputin) 

}
