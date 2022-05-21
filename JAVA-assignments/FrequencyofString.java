package package2;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyofString {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
        int[] frequency = new int[str.length()];  
        char string[] = str.toCharArray();  
        Arrays.sort(string); 
        for(int i = 0; i <str.length(); i++) {  
            frequency[i] = 1;  
            for(int j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    frequency[i]++;   
                    string[j] = '0';  
                }  
            }  
        } 
        System.out.println("Characters and frequencies");  
        for(int i = 0; i <frequency.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + frequency[i]);  
        }  

	}

}
