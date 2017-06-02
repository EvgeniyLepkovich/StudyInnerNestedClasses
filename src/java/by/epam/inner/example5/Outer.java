package by.epam.inner.example5;

public class Outer {

	public static void main(String[] args) {
		System.out.println(Inner.b);
		System.out.println(Inner.c);
	}
	
	class Inner{
		// public static int a=5; impossible without final modifier
		public static final int b=5;
		private static final int c=5;
	}

}
