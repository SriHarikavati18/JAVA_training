
public class ifelseif {

	public static void main(String[] args) {
		//syntax
		//if first if condition is false it jumps to the  elseif condition
		
		int marks =70;
		if(marks<34) {
			System.out.println("fail");
		}else if(marks<=34 || marks<=50){ //if this not true it moves to another else if condition 
			System.out.println("c grade");
		}else if(marks<=51 || marks<=65){
			System.out.println("B grade");
		}else if(marks<=66 || marks<=85){
			System.out.println("A grade");
		}
		else {
			System.out.println("invalid marks");
		}

	}

}
