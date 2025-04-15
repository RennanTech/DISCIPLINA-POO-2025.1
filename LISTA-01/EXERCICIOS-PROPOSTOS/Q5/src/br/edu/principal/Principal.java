package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco, desconto, novopreco;
		
		System.out.print("Insira o valor do produto: ");
		preco = sc.nextInt();
		
		desconto = preco * 10/100;
		
		novopreco = preco - desconto;
		
		System.out.println("O novo valor do produto é: " + novopreco);
	}
}
