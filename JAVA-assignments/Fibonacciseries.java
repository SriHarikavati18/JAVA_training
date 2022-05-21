
public class Fibonacciseries {

	public static void main(String[] args) {
		int num=0,a=1,b=1;
		//System.out.println();
        while(num<=100) {
        	num=a+b;
        	System.out.println(num +" ");
        	a=b;
        	b=num;
        	
        }
	}

}
