
public class switchcase {

	public static void main(String[] args) {
		//similar to the ifelseif
		/*
		 switch(variable){
		 case 1:
		       //execute code here (if the value of variable equals to 1)
		        break;
		  case 2:
		       //execute code here
		        break;
		   default:
		         //execute default;     
		      }
		 */
		//variables used in the switch case is 1.integer 2.character 3.byte 4.string 5.enum
		
		char grade='B';
		switch(grade) {
		case 'A':
			System.out.println("excellent.grade A"); //if we dont have the break statement it will execute all from true
			break;
		case 'B':
			System.out.println("welldone.grade B");
			break;
		case 'C':
			System.out.println("average.grade c");
			break;
			default:
				System.out.println("default grade entered");
				
			
		
		
		}
		

	}

}
