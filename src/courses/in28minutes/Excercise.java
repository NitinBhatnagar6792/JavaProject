package courses.in28minutes;

public class Excercise {

	public static void main(String[] args) {
		//printTable(5);
		//printSquareOfFirstNEvenNumbers(10);
		int i = 0xA;
		int j = 0xA0;
		int k = 0xABC; // = 10*16*16 + 11 *16 + 13 = 10 * 256 + 11 * 16 + 13
		float l = 10.5f;
		double d = 10.345;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("l="+l);
		System.out.printf("d=%04.2f\n",d);
	}

	private static void printTable(int tableOf) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %02d = %02d\n", tableOf, i, i * tableOf);
		}
	}

	private static void printSquareOfFirstNEvenNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.printf("square of %02d = %02d\n", i*2, 4*i*i);
		}
	}

}
