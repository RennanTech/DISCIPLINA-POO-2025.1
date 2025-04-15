package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, perc, aumento, novosal;
		
		System.out.print("Insira seu salário: ");
		sal = sc.nextInt();
		
		System.out.print("Insira o percentual de aumento: ");
		perc = sc.nextInt();
		
		aumento = sal * perc/100;
		
		novosal = sal + aumento;
		
		System.out.print("Seu novo salário é: " + novosal);

	}
}
