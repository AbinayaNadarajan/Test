package exception;

import java.io.*;

public class ExceptionHandlingTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Assingning value");
		} catch (Exception ae) {
			System.out.println("the specified file is not present ");
		}

		try {
			int k;
			while ((k = fis.read()) != -1) {
				System.out.println("method is missing" + k);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("the io exception occurs");
		}
	}

}
