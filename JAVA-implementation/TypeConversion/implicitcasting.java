package typeconversion;

public class implicitcasting {

	public static void main(String[] args) {
		//typeconversion or typecasting
		//implicit casting:automatically converts lower data types to higher data types
		//int to   double,float,long
		//float to double
		
		double d1=4;//int->double (because int can fit into double but double into int notpossible due to size)
	    double d2=4.2f;//float->double (double size is greater than float )
	    long l1=100;//int->long(long size greater than int)
	    System.out.println(d1);

	}

}
