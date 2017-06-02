package by.epam.inner.example3;

public class Foo implements OuterInterface{
	public static void main(String[] args) {
		inner.setA(5);
		System.out.println(inner.getA());
	}
}
