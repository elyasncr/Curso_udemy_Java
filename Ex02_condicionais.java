package curso_java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int b;
		
		b = sc.nextInt();
		
		if (b % 2 == 0) {
			System.out.println("PAR");
			
		}
		else {
			System.out.println("IMPAR");
		}
			
		sc.close();
	}
}
