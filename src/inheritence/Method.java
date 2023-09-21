package inheritence;

public class Method {
	public void login(String username, String password)
	{
		System.out.println("enter username:" + username);
		System.out.println("enter password:" + password);
		System.out.println("sign in to mailbox");
		
	}
	public void composeEmail(String text)
	{
	System.out.println("compose email with text as:" + text);
	}
	public void logout()
	{
		System.out.println("click on logout button");
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		obj.login("pradyumn", "patidar");
		obj.login("patel","pradyumn");
		obj.composeEmail("hello");
		obj.composeEmail("dudess");
		obj.logout();
		

	}

}
