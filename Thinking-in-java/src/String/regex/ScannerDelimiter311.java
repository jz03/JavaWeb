package String.regex;

import java.util.Scanner;

/*
 * ʹ�ö�����Ϊ�����
 */
public class ScannerDelimiter311 {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner("33,88,00,99,89");
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNextInt())
			System.out.println(scanner.nextInt());
	}
}
