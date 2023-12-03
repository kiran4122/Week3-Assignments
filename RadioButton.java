package week3.day2;

public class RadioButton extends Button{
 public static void main(String[] args) {
	
	 RadioButton radio = new RadioButton();
	 radio.click();
	 radio.setText("new");
	
	 radio.submit();
	 radio.selectRadioButton();
}
	
		public void selectRadioButton() {
			System.out.println("SelectRadioButton");
		}
}
