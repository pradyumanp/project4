package inheritence;

public class Returndemo {
	//this are global variable
	int x= 100;
	String str3 = "java";
	public int sum()
	{
		int a=10;
		int b=20;
		int result= a+b+x;
		return result;
	}
	public String concatmethod()
	{
		String str1= "selenium";
		String str2 = "training";
		String result = str1+str2+str3;
		return result;
		
		
	}

	public static void main(String[] args) {
		Returndemo obj = new Returndemo();
		System.out.println(obj.concatmethod());
		int value = obj.sum();
		System.out.println(value);
	
		
		// TODO Auto-generated method stub

	}

}
