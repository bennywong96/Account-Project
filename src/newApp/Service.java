package newApp;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

public class Service {
	
	private static String BAD_ACCOUNT = "123456";
	private Map <String, Account> accountMap = new HashMap<String, Account>();
	
	
	public void addAccount(Account account) {
		accountMap.put(account.getAccountNumber(), account);
	}
	
	public Account getAccount(String accNumber) {
		return accountMap.get(accNumber);
		
	}

	public Map<String, Account> getAccountMap() {
		return accountMap;
	}
	
	public JSONObject convertJSON() {
		JSONObject json = new JSONObject(accountMap);
		return json;
	}
	
	public String getXML() {
		String newXML = XML.toString(convertJSON());
		return newXML;
	}
	
	 public String getBlockedAccount(String accNum)
			  throws AccountBlockedException
			  {
			    if (accNum.equals(BAD_ACCOUNT))
			    {
			      throw new AccountBlockedException("Account is Blocked, Please Contact Admin");
			    }
			    else
			    {
			      return "Account Not Blocked";
			    }
			  }
	
	

	
	

}
