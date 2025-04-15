package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int n1, n2, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		resultado = n1 - n2;
		
		System.out.println("Insira o primeiro número: " + resultado);
	}
}
