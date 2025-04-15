package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, resultado;
		
		System.out.print("Insira o primeiro número (Exceto números <= 0): ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o primeiro número (Exceto números <= 0): ");
		n2 = sc.nextInt();
		
		resultado = n1 / n2;
		
		System.out.println("O resultado da divisão é: " + resultado);
		
	}
}
