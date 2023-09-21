package inheritence;

public class Voidstring {
	public void login()
	{
		System.out.println("enter username");
		System.out.println("enter password");
	}
	public void email()
	{
		System.out.println("compose email");
	}
	public void logout()
	{
		System.out.println("click on logout");
	}

	public static void main(String[] args) {
		Voidstring obj = new Voidstring();
		obj.login();
		obj.email();
		obj.logout();
		
		// TODO Auto-generated method stub

	}

}
