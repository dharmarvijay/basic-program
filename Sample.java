package myjava;

public class Sample {

	public static void main(String[] args) {
		Sample casio=new Sample();
		int c=casio.add();
		casio.percenrage(c);
		
		// TODO Auto-generated method stub

	}

	private void percenrage(int c) {
		int percentage=c/2;
		System.out.println(percentage);
		// TODO Auto-generated method stub
		
	}

	private int add() {
		int a=6,b=10;
		int c=a+b;
		return c;
		// TODO Auto-generated method stub
		
	}

}
