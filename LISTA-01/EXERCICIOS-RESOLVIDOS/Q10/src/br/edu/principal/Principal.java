package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, raio;
		
		System.out.print("Insira o valor do raio: ");
		raio = sc.nextDouble();
		
		area = 3.1415 * (raio * raio);
		
		System.out.print("O valor da área é: " + area);
	}
}
