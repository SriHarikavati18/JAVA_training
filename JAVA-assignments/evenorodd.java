package package2;

import java.util.Scanner;

public class evenorodd {
	 public static void main(String [] args) {
		 int number;
		 System.out.println("enter the number:");
		 Scanner sc= new Scanner(System.in);
		 number=sc.nextInt();
		
		 if(number%2==0) {
			 System.out.println("even");
		 }else if(number%2!=0){
			 System.out.println("odd");
		 }else {
			 System.out.println(" not valid input");
		 }
		 
		 
		 
		 
		 
		 
	 }

}
