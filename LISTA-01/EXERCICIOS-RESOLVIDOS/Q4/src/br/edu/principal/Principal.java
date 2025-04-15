package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, novosal, aumento;
		
		System.out.print("Insira seu salário: ");
		sal = sc.nextInt();
		
		aumento = sal + sal * 25/100;
		
		novosal = sal + aumento;
		
		System.out.println("Seu novo salário é: " + novosal);
	}
}
