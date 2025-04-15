package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double sal, vendas, comissao, saltotal;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		sal = sc.nextDouble();
		
		System.out.print("Digite o valor das vendas: ");
		vendas = sc.nextDouble();
		
		comissao = vendas * 4/100;
		saltotal = comissao + sal;
		
		System.out.println("Sua comissão foi de: " + comissao);
		System.out.println("Seu salário total é de: " + saltotal);
	}

}
