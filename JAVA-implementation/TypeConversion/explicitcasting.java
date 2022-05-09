package typeconversion;

public class explicitcasting {

	public static void main(String[] args) {
		//explicitcasting:doesnt convert automatically it converts from higher to lower data types
		//double,float,long to   int
		//double to float
	
		/*
	    int i1=4.0;//error (we cannot save the double in int due to the  size )
		int i2=8L;//error(we cannot save the long in int due to the  size )
		float f1=4.5;//error(we cannot save the double in float due to the  size )
		*/
		int i1=(int)4.5;//we can acheive the output by giving the (new data type) expression
		//(int)4.5 ->4(dataloss) we loss the data by covert it from higher to lower
		int i2=(int)8L;
		float f1=(float)4.5;// or we can convert it by float f1= 4.5f
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(f1);
		

	}

}
