package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, soma1, soma2, media;
		
		System.out.print("Insira o primeiro número (Exceto números <= 0): ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o primeiro número (Exceto números <= 0): ");
		n2 = sc.nextInt();
		
		soma1 = n1 * 2;
		soma2 = n2 * 3;
		
		media = soma1 + soma2 / 5;
		
		System.out.println("Sua média é: " + media);
	}
}
