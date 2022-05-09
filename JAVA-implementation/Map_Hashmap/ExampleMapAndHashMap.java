import java.util.HashMap;

public class ExampleMapAndHashMap {

	public static void main(String[] args) {
		// mapping is nothing but mapping the keys to the values
       //in Hash it doesnt provide certain order while producing the output
		HashMap<String, Integer> empIds =new HashMap<>();
		empIds.put("rajusalary", 45000);
		empIds.put("nayaksalary", 55000);
		empIds.put("saisalary", 65000);
		System.out.println(empIds.get("rajusalary"));//here we will get the key of rajusalary
		System.out.println(empIds.containsKey("saisalary"));
		empIds.put("rajusalary", 15000);// here put updates the value of rajusalary because the string alreadyexisted but not value
		System.out.println(empIds);
		empIds.replace("srinusalary", 777);
	    System.out.println(empIds);	//in this output it not gona change the because the both the values not existed 
	    empIds.putIfAbsent("Steven salary",70000);
	    System.out.println(empIds);//it prints this values if there is absense of that particular values 
	    //but if we give values of which is already presented it will not print
	    //like if input is this ("rajusalary",15000) its not gonna print anything because it was already existed
	    
	}

}
