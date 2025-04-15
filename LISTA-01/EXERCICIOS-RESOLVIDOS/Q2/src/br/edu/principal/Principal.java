package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int n1, n2, n3, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primeira nota: ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o segunda nota: ");
		n2 = sc.nextInt();
		
		System.out.print("Insira o terceira nota: ");
		n3 = sc.nextInt();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println("A sua média é: " + media);
	}
}
