package myjava;

import java.util.Scanner;

public class TwoDimentionalPattern {

	public static void main(String[] args) {
		System.out.println("enter the rowcount");
		Scanner scanner=new Scanner(System.in);
		int rowcount=scanner.nextInt();
		String[][] matrix=new String[rowcount][rowcount];
		for(int row=0;row<rowcount;row++)
		{
			for(int colum=0;colum<=row;colum++)
			{
				
				if(row==colum)
				{
					matrix[row][colum]="*";
					System.out.print(matrix[row][colum]);
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
