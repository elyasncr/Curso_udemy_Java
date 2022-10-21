package curso_java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Testes{
	
	public static void main(String[] args) {
		
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
			
			int numero, horas;
			double valorHora, salario;
			
			numero = sc.nextInt();
			horas = sc.nextInt();
			valorHora = sc.nextDouble();
			
			salario = valorHora * horas;
			
			System.out.println("Number = " + numero);
			System.out.printf("Salary = U$ %.2f%n", salario);
				
				sc.close();
	}
}