package exception;

public class UnCheckedException1 {

	public static void main(String[] args) {
		int d = 5;
		int f = 10;
		try {
			int a = 3;
			int b = 0;
			int r = a / b;
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("throws arithmetic exception");
		}
		int h = f / d;
		System.out.println(h);

	}

}
