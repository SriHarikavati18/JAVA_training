
public class AddMatrixUsingMultiDimensionalArray {

	public static void main(String[] args) {
		int rows=2,columns=3;
		int[][] m1= {{2,3,4},{7,8,9}};
		int[][] m2= {{1,2,3},{9,5,1}};
		int[][] sum= new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum[i][j]=m1[i][j]+m2[i][j];
			}
		}
		System.out.println("the sum of two matrix is:");
		for (int[]row:sum) {
			for(int column:row) {
				System.out.print(column + "\t");
			}
			System.out.println();
		}
	}

}
