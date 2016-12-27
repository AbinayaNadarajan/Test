package checkTest;

import java.util.Scanner;

public class Check {
	static int i = 0;
	static int a[] = new int[101];
	int counter = 0;
	static boolean result = false;

	public int add(int num) {
		if (num <= 100) {
			Check.a[this.counter] = num;
			/*The below line will print the value of a
			 * System.out.println("The value of a is "+a[counter]);
			 */
			this.counter++;
			return add(num + 1);
		} else {
			return 0;
		}
	}

	public boolean isInArray(int b) {
		if (i <= 100) {
			if (a[i] == b) {
				result = true;
			}
			i++;
			isInArray(b);
		}
		return result;
	}

	public static void main(String[] args) {
		Check c = new Check();
		c.add(1);
		Scanner s = new Scanner(System.in);
		int b;
	    System.out.println("Enter the values of b");
		b = s.nextInt();
		System.out.println(c.isInArray(b));
		s.close();
	}
}
