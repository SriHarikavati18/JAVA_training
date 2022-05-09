
public class nestedif {

	public static void main(String[] args) {
		//if there if condtion inside the  if condition that is nested if 
		//if the first if condition is false it directly jumpss to the else condition  
		/*if(condition){
		      if(condition){
		      //execute code
		       }else{
		       }
	      }else{
	      //code executes
	      }
		 */
		int salary =25000;
		if (salary >15000) { //if this is false it directly jumps to the else statement
			if(salary >10000) {
				System.out.println(true);
			}else {
				System.out.println(false +"1");
			}
		}else {
			System.out.println(false + " 2 ");
		}

	}

}
