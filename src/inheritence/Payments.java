package inheritence;

public class Payments extends Homepage{
	//base grandchild and home child
	//multilevel inheritance
	public void payments() {
		System.out.println("test payment page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments obj = new Payments();
		obj.openbrowser("chrome");
		obj.login();
		obj.logout();
		obj.Homepagetest();
		obj.payments();

	}

}
