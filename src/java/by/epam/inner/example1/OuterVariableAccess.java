package by.epam.inner.example1;

public class OuterVariableAccess {
	private int a=5;
	public void printA(){
		System.out.println(a);
	}	
	class Inner{
		public void printA2(){
			System.out.println(a);
		}
	}
	public static void main(String[] args){
		Inner a = new OuterVariableAccess().new Inner();
		a.printA2();
	}	
}
