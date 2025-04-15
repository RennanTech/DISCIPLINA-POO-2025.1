package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, soma;
		
		System.out.print("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.print("Insira o terceiro número: ");
		n3 = sc.nextInt();
		
		System.out.print("Insira o quarto número: ");
		n4 = sc.nextInt();
		
		soma = n1 + n2 + n3 + n4;
		
		System.out.println("A soma dos números é: " + soma);
	}
}
