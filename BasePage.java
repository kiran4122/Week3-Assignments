package week3.day2;

public class BasePage {
	
	public static void main(String[] args) {
		
		BasePage c1 = new BasePage();
		c1.findElement();
		c1.clickElement();
		c1.enterText();
		c1.performCommonTasks();
	}
	
	public void findElement() {
		System.out.println("findElement");
	}
	public void clickElement() {
		System.out.println("clickElement");
	}
	public void enterText() {
		System.out.println("enterText");
	}
	public void performCommonTasks() {
		System.out.println("performCommonTasks");
	}
}

