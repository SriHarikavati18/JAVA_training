package package2;



public class DuplicateValueFromString {

	public static void main(String[] args) {
		String Str = "super position";

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i <Str.length(); i++) {

			if (builder.indexOf(String.valueOf(Str.charAt(i))) == -1) {

				builder.append(Str.charAt(i));

			}
		}

		System.out.println("Original String : " + Str);
		System.out.println("After removing the duplicates : " + builder.toString());


	}

}
