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
	
	
}
