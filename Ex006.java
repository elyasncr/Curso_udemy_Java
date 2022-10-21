package curso_java_udemy;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi;
		
		pi = 3.14159;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		areaTriangulo = A*C/2;
		areaCirculo = (float) (Math.pow(C, 2)*pi);
		areaTrapezio = ((A+B)*C)/2;
		areaQuadrado = (float) Math.pow(B, 2);
		areaRetangulo = A*B;
		
		System.out.printf("Triangulo: %.3f%n", areaTriangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
			
		sc.close();
	}
}
