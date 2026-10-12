package october_12th.relationship.bank;

public class StaticDemo1 {
	public static void main(String[] args) {
		
		
		System.out.println("Initial User Count:" + UserAccount.totalUsers);
		
		UserAccount u1= new UserAccount("Pratik");
		UserAccount u2= new UserAccount("Himanshu");
		UserAccount u3= new UserAccount("Utkarsh");
		
		System.out.println("Total users registered are: "+ UserAccount.totalUsers);
	}
}
