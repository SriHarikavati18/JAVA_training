import java.util.Scanner;

public class AverageofArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter how many elements ");
		int n=obj.nextInt();
		double[] arr= new double[n];
		System.out.println("Enter" +n+ "elements");
		double sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextDouble();
			sum= sum+arr[i];
		}
		System.out.println("average is"+sum/n);
		

	}
}

	