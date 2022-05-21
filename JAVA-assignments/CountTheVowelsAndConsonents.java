import java.util.Scanner;

public class CountTheVowelsAndConsonents {

	public static void main(String[] args) {
		System.out.println("Enter Some String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[]chars=str.toCharArray();//to convert string into  char
		 
		int count=0;
		for(char c: chars) {
			
			switch(c) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				count++;
				break;
				
			}
		}
		System.out.println("Number of vowels in string =" +count);

	}

}
