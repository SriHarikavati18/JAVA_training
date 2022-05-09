
public class singleDarray {

	public static void main(String[] args) {
		//single value containers
	     int state1population=345;
		int  state2population=456;
		int  state3population=584;
		int  state4population=683;
		int  state5population=562;
		
		//multivaluecontainer
		//int[] statepopulation = new int[5];
		//System.out.println("statepopulation is:"+statepopulation[0]);
		
		//write and update 
		/*statepopulation[0]=300;
		statepopulation[1]=350;
		statepopulation[2]=360;
		statepopulation[3]=380;
		statepopulation[4]=400;*/
		
		//also store the values in form 
		int[] statepopulation=new int[]{200,300,400,500,600};
		for(int i=0;i<statepopulation.length;i++) {
			
		
		System.out.println("statepopulation is:"+statepopulation[i]);
		statepopulation[3]=999;
		//System.out.println(statepopulation[3]);
		
		}
 //enhanced for loop for each loop 
		
		
		//read all
		//for(int i=0;i<statepopulation.length;i++) {
			//System.out.println("statepopulation:"+statepopulation[i]);
		//}
		
		

	}

}
