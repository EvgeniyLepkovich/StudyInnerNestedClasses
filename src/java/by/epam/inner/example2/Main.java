package by.epam.inner.example2;

public class Main {
	public static void main(String[] args) {
		D d = new D();
		d.printA();
		D.E e = d.new E();
		e.printA();
		D.E.F f = e.new F();
		f.printA();
	}
}

class D{
	private int a=5;
	public void printA(){
		System.out.println(a);
	} 
	class E{
		private int a=6;
		public void printA(){
			System.out.println(a);
		} 
		class F{
			//private int a=7;
			public void printA(){
				System.out.println(a);
			} 
		}
	}	
}
