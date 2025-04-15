package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double B, b, h, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor da base maior: ");
		B = sc.nextDouble();
		
		System.out.print("Insira o valor da base menor: ");
		b = sc.nextDouble();
		
		System.out.print("Insira o valor da altura: ");
		h = sc.nextDouble();
		
		resultado = ((B + b) * h) / 2;
		
		System.out.println("Resultado: " + resultado);
	}
}
