package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, p1, p2, p3, media,
		soma1, soma2, soma3, total;
		
		System.out.print("Insira a primeira nota: ");
		n1 = sc.nextInt();
		
		System.out.print("Insira a segunda nota: ");
		n2 = sc.nextInt();
		
		System.out.print("Insira o terceira nota: ");
		n3 = sc.nextInt();
		
		System.out.print("Insira o primeiro peso: ");
		p1 = sc.nextInt();
		
		System.out.print("Insira o segundo peso: ");
		p2 = sc.nextInt();
		
		System.out.print("Insira o terceiro peso: ");
		p3 = sc.nextInt();
		
		soma1 = n1 * p1;
		soma2 = n2 * p2;
		soma3 = n3 * p3;
		total = p1 + p2 + p3;
		media = (soma1 + soma2 + soma3) / total;
		
		System.out.print("Sua média: " + media);

	}
}
