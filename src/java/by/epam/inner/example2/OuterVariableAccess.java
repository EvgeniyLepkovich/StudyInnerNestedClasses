package by.epam.inner.example2;

public class OuterVariableAccess {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.printA();
		Outer.Middle middle = outer.new Middle();
		middle.printA();
		Outer.Middle.Inner inner = middle.new Inner();
		inner.printA();
	}
}

class Outer{
	private int a=5;
	public void printA(){
		System.out.println(a);
	} 
	class Middle{
		private int a=6;
		public void printA(){
			System.out.println(a);
		} 
		class Inner{
			//private int a=7;
			public void printA(){
				System.out.println(a);
			} 
		}
	}	
}
