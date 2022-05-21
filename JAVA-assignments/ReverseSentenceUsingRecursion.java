package package2;

import java.util.Scanner;

public class ReverseSentenceUsingRecursion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String sentence =sc.nextLine();
		String reverseSentence =reverse(sentence);
		System.out.println("The string sentence is:"+ reverseSentence);

	}
    public static String reverse(String sentence) {
    	if(sentence.isEmpty()) {
    		return sentence;
    	}else {
    		return reverse(sentence.substring(1))+sentence.charAt(0);
    	}
	
    }
	
}
