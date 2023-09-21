package inheritence;

public class Homepage extends Base{
	
	public void Homepagetest() {
		System.out.println("test for homepage");
		
	}

	public static void main(String[] args) {
		Homepage obj = new Homepage();
		obj.openbrowser("chrome");
		login();
		obj.Homepagetest();
		obj.logout();
		
		// TODO Auto-generated method stub
		//this is single level inheritance

	}

}
