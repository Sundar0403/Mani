package storage;

import java.util.HashMap;
import java.util.Map;

import user.UserDetails;
import utility.UtilityClass;

public class DetailsStorage {
	UtilityClass utilObj=new UtilityClass();
	
	private Map<String,UserDetails> userMap=new HashMap<>();
	
	public Map<String, UserDetails> setUserDetails(String email_Id, UserDetails userObj) throws Exception
	{
		utilObj.stringCheck(email_Id);
		utilObj.objectCheck(userObj);
		userMap.put(email_Id,userObj);
		return userMap;
	}

	public UserDetails getUserDetails(String email_Id) throws Exception
	{
		UserDetails userObj=userMap.get(email_Id);
		return userObj;
	}

}
