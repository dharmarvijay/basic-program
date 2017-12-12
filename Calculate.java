package myjava;

import java.util.Scanner;

public class Calculate{

	public static void main(String[] args) {
		Calculate casio=new Calculate();
		int total=casio.add();
		casio.calculatepercentage(total);
		// TODO Auto-generated method stub

	}
	
	private void calculatepercentage(int total) {
		float a=total/5;
		// TODO Auto-generated method stub
		
	}

	private void calculatepercentage() {
		
		// TODO Auto-generated method stub
		
	}

	private int add() {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int total=0,subject;
		System.out.println("subject count");
		int subjectcount=scanner.nextInt();
		int[] marks=new int[subjectcount];
		System.out.println("enter the marks");
		for(subject=0;subject<marks.length;subject++)
		{
			
			 marks[subject]=scanner.nextInt();
			total=total+marks[subject];
		}
		System.out.println("total");
		System.out.println(total);
		return total;
		// TODO Auto-generated method stub
		
	}

}
