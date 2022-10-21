package curso_java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		if (a < 0) {
			System.out.printf("Este numero e negativo %n", a);
		} else {
			System.out.println("Este numero nao e negativo.");
		}
		
			sc.close();
	}

}
