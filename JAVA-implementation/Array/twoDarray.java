
public class twoDarray {

	public static void main(String[] args) {
		//easy way of assigning values
		int[][] lotterycard = {
				{20,21,22},
				{30,31,32},
				{40,41,42}
		 };
		
		//second wayof assiging values
		int[][] lotterycard2 =new int[3][3];
		lotterycard2[0][0]=20;
		lotterycard2[0][1]=21;
		lotterycard2[0][2]=22;
		lotterycard2[1][0]=30;
		lotterycard2[1][1]=31;
		lotterycard2[1][2]=32;
		lotterycard2[2][0]=40;
		lotterycard2[2][1]=41;
		lotterycard2[2][2]=42;
		//[row][column]
		System.out.println(lotterycard2[0][0]);
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(lotterycard[i][j]+" "
						+ "");
			}
			System.out.println();
		}
		 
		
	}

}
