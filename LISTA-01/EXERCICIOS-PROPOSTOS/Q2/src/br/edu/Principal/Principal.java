package br.edu.Principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, resultado;
		
		System.out.print("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.print("Insira o terceiro número: ");
		n3 = sc.nextInt();

		
		resultado = (n1 * n2 * n3);
		
		System.out.print("Resultado: " + resultado);
	}
}
