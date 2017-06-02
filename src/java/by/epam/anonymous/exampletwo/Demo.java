package java.by.epam.anonymous.exampletwo;

public class Demo {
	
	private static int a = 6;
	private static int b = 5;
	private static int c = 10;

	public static void main(String[] args) {
		
		/*
		 * three printResult() in each we are creating anonymous classes
		 * with different realization of  someMath() method
		 */
		
		ResultPrinter.printResult(a, b, c, new AnyInterface() {
			@Override
			public int someMath(int a, int b) {
				return a + b;
			}
		});
		
		ResultPrinter.printResult(a, b, c, new AnyInterface() {
			@Override
			public int someMath(int a, int b) {
				return a * b;
			}
		});
		
		ResultPrinter.printResult(a, b, c, new AnyInterface() {
			@Override
			public int someMath(int a, int b) {
				return a - b;
			}
		});
		

	}

}
