
public class FindTheBiggestValueinArray {

	public static void main(String[] args) {
		int[] Array= {2,25,9,8,26};
		
		int Maxnum =Array[0];
		for(int j:Array) {
			if(j>Maxnum) {
				Maxnum=j;
			}
		}
		System.out.println(Maxnum);
	}

}
