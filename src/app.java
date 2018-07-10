import org.json.JSONObject;

import newApp.Account;
import newApp.Service;

public class app {

	public static void main(String[] args) {
		
		Account account;
		Service service;
	
		account = new Account("Benny", "Wong", "1");
		service = new Service();
		service.addAccount(account);

		
		
		JSONObject newJSON = service.convertJSON();
		System.out.println(newJSON);
		
		System.out.println("Hello World to the standard out");
		
	}

}
