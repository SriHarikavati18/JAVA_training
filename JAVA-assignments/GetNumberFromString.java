package package2;

public class GetNumberFromString {

	public static void main(String[] args) {
		
		// to get digits from given string
		String input1="the page not found 404";
		String input20="internal server 500 error";
		
		System.out.println("The number part is:"+ input1.replaceAll("[^0-9]"," "));
		System.out.println("The number part is:"+ input20.replaceAll("[^0-9]"," "));
		}

}
