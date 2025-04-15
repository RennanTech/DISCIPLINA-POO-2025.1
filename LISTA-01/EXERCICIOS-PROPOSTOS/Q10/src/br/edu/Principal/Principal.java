package br.edu.Principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado, resultado;
		
		System.out.print("Insira o valor do lado do quadrado: ");
		lado = sc.nextDouble();
		
		resultado = lado * lado;
		
		System.out.println("A área do quadrado é: " + resultado);
	}
}
