package newApp;
import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class NewTest {
	
	private static Account account;
	private static Service service;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@BeforeClass
	public static void setUp() {
		account = new Account("Benny", "Wong", "1");
		service = new Service();
		service.addAccount(account);
	}

	@Test
	public void test() {
		Account newAccount = service.getAccount(account.getAccountNumber());
		Assert.assertTrue("Account Number is not found", account.equals(newAccount));
	}
	
	@Test
	public void toJSON() {
		JSONObject newJSON = service.convertJSON();
		
	}
	@Test
    public void blockedAccountTest() throws AccountBlockedException {
		thrown.expect(AccountBlockedException.class);
		service.getBlockedAccount("123456");
	}
	
	@Test
    public void countingFirstNames() {
		Account account2 = new Account("Bob", "AA", "2");
		Account account3 = new Account("Benny", "BB", "3");
		Account account4 = new Account("Benny", "CC", "4");
		service.addAccount(account2);
		service.addAccount(account3);
		service.addAccount(account4);
		int numberBenny =service.searchByFirstName("Benny");
		Assert.assertEquals(numberBenny, 3);
		System.out.println("Number of Benny: " + numberBenny);
		
		
	}
	
	
}
