package by.epam.inner.example1;

public class A {
	private int a=5;
	public void printA(){
		System.out.println(a);
	}
	
	class B{
		public void printA2(){
			System.out.println(a);
		}
	}
	public static void main(String[] args){
		B a = new A().new B();
		a.printA2();
	}
	
}
