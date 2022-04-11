import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		int row,col,i,j,k;
		Scanner obj=new Scanner(System.in);
 		System.out.print("Enter the number of rows: ");
		row =obj.nextInt();
 		System.out.print("Enter the number of columns: ");
		col=obj.nextInt();
 		int mat[][][] = new int[2][row][col];
		int result[][] = new int[row][col];
		for(k=0; k<2; k++){
			System.out.println("Enter the elements of matrix " + (k+1) + ": ");
			for (i=0;i<row;i++){
 				for(j=0;j<col;j++)
					mat[k][i][j]=obj.nextInt();
 			System.out.println();
			}
		}
 		System.out.println("Sum of matrices: ");
		for(i=0;i<row;i++){
			for(j= 0;j<col;j++)
				System.out.print((mat[0][i][j]+mat[1][i][j])+"\t"); 
			System.out.println();
		}
	}
}