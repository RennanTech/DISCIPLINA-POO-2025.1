package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double pesoK, pesoG;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso em KG: ");
		pesoK = sc.nextDouble();
		
		pesoG = pesoK * 1000;
		
		System.out.println("Seu peso em gramas é: " + pesoG + 'g');
	}
}
