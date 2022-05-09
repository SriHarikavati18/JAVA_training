
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str =new StringBuffer("welcome");
		System.out.println(str);
		System.out.println(str.append(" hari"));//welcome hari
		//System.out.println(str.insert(1,"hi"));//Whielcome hari
		//System.out.println(str.delete(0, 3));//come hari
		//System.out.println(str.reverse());
		System.out.println(str.replace(8, 11, "guna"));

	}

}
