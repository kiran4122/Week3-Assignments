package week3.day2;

public class TextField extends WebElement{
	
	public static void main(String[] args) {
		
		TextField field = new TextField();
		field.click();
		field.getText();
		field.setText("jo");
	
	}
	
	public void  getText() {
		System.out.println("getText	");
	}

}
