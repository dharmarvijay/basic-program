package myjava;

import java.util.Scanner;

public class TwoDimentionalPatternReverse {

	public static void main(String[] args) {
		System.out.println("enter the rowcount");
		Scanner scanner=new Scanner(System.in);
		int rowcount=scanner.nextInt();
		int colum;
		String[][] matrix=new String[rowcount][rowcount];
		for(int row=1;row<rowcount;row--)
		{
			for(colum=rowcount;colum>0;colum--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=row;k--)
			{
			matrix[row][k]="*";
			System.out.print(matrix[row][colum]);
		}
			}
		System.out.println();
	
	}
}
