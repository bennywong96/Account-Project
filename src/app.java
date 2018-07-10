import org.json.JSONObject;

import newApp.Account;
import newApp.Service;

public class app {

	public static void main(String[] args) {
		
		Account account, account2, account3;
		Service service;
	
		account = new Account("Benny", "Wong", "1");
		account2 = new Account("Bob", "AA", "2");
		account3 = new Account("Benny", "BB", "3");
		service = new Service();
		service.addAccount(account);
		service.addAccount(account2);
		service.addAccount(account3);
		
		System.out.println(service.searchByFirstName("Benny"));

		
		System.out.println("Hello World to the standard out");
		
	}

}
