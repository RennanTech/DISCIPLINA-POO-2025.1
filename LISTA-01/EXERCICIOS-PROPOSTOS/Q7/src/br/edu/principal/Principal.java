package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double peso, pesoQ, pesoV;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		peso = sc.nextDouble();
		
		pesoQ = peso + (peso * 15/100);
		pesoV = peso + (peso * 20/100);
		
		System.out.print("Seu peso com 15% a mais de gordura é: " + pesoQ);
		System.out.print("Seu peso com 20% a mais de gordura é: " + pesoV);
	}
}
