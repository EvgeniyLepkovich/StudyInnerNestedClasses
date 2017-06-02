package by.epam.inner.example3;

public interface A {
	public final Inner inner = new Inner();
	class Inner{
		public int a;
		public int b;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		
	}	
}
