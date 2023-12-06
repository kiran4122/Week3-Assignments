package week3.day2;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		
		String text = "We learn java basic as part of java sessions in java week1 ";
		String[] word = text.split(" ");
		int count = 0;
		
		for (int i = 0; i < word.length; i++) {
			
			for (int j = i+1; j < word.length; j++) {
				
				if (word[i].equals(word[j])) {
					
					word[j]="";
					count++;
					
				}
				
			}
			
		}
for (int i = 0; i < word.length; i++) {
			
			
			System.out.print(word[i] + " ");
}
	}

}
