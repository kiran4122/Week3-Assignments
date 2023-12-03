package week3.day2;

public class Loginpage extends BasePage{
	
	public void performCommonTasks() 
	{
		System.out.println("performCommonTasks:ABS");
	}
	
	
	public static void main(String[] args) {
		
		Loginpage c1 = new Loginpage();
		c1.performCommonTasks();

	}
}
