package week3.day2;

public class ChangeOddIndex {

	private static char[] charArray;

	public static void main(String[] args) {
		String test="changeme";
	int len=test.length();
		char arr[]=test.toCharArray();
		for(int i=0;i<len;i++) {
			if(i%2!=0) {
				arr[i]=Character.toUpperCase(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}