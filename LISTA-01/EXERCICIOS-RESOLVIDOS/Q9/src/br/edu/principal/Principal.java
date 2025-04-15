package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double base, altura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor da Base: ");
		base = sc.nextDouble();
		
		System.out.print("Insira o valor da Altura: ");
		altura = sc.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.print("A área do triângulo é: " + area);
		}
}
