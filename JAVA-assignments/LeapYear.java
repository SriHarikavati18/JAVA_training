import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y;
		System.out.println("enter the year: ");
		y= in.nextInt();
		if((y%4==0) && (y%100!=0)||(y%400==0)){
			System.out.println("leap year");
		}else {
			System.out.println("not a Leap year");
		}
	}

}
