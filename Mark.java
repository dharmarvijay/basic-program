package myjava;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the marks:");
		int marks=scanner.nextInt();
		System.out.println("enter the student");
		int student =scanner.nextInt();
		for(int studentcount=0;studentcount<student;studentcount++)
		{		int total=0;
			for(int markcount=0;markcount<marks;markcount++)
				{
				System.out.println("enter the mark");
			    int mark=scanner.nextInt();
		        total=total+mark;
				
		}
		
		System.out.println(total);
		// TODO Auto-generated method stub

	}

}

}
