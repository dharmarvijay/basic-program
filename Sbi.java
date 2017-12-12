package myjava;

import java.util.Scanner;

public class Sbi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int amount=scanner.nextInt();
		int gender=scanner.nextInt();
		float interest=9.95f;
		float interest1=10.70f;
		int year=1;
		if(gender==0&&amount<750000)
		{
			float siinterest=(amount*interest*year)/100;
			System.out.println(siinterest);
		}
		else if(gender==0&&amount>=750000)
		{
			float siinterest=(amount*interest1*year)/100;
			System.out.println(siinterest);
		}
		else if(gender==1&&amount<750000)
		{
			float interest2=interest-1;
			float siinterest=(amount*interest2*year)/100;
			System.out.println(siinterest);
		}
		else if(gender==1&&amount>=750000)
		{
			float interest2=interest-1;
			float siinterest=(amount*interest2*year)/100;
			System.out.println(siinterest);
		}
		// TODO Auto-generated method stub

	}

}
