package october_12th.relationship.bank;

class UserAccount{
	
	String username;
	static int totalUsers=0;
	
	UserAccount(String name)
	{
		 username = name;
		 totalUsers++;
	}

}

