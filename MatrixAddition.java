package javaninety;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] array= {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		int[][] array2 ={{9,8,7},
						 {6,5,4},
						 {3,2,1}};
		
		int[][] AddMatrix = new int[3][3];
		
		for(int i = 0;i<array.length; i++)
		{
			for (int j = 0;j<array.length;j++)
					{
					AddMatrix[i][j] = array[i][j]+array2[i][j];
					}
		}
		System.out.println();
		
		for (int i=0; i<array.length;i++)
		{
			for(int j=0; j<array.length;j++)
			{
				System.out.print(AddMatrix[i][j]+",");
			}
			System.out.println("");
			
		}	

	}

}
