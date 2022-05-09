
public class ternaryOperator {

	public static void main(String[] args) {
		//same like if else condition
		//syntax 
		/* 
		  Using ternary Operator
		  condition? Exp1 : Exp2; // if condition is true exp1 is executed orelse exp2 executes
		 */
		
		//ternary Operator
		int a=34;
		int b=55;
		int min;
		/* 
		 if(a<b){
		 min =a;
		     }else{
		     min = b;
		     }
		 */
		min =(a<b)? a:b;
		System.out.println("min value is :"+ min);

	}

}
