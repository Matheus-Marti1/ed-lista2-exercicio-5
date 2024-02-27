package view;

import java.util.Scanner;

import controller.CalcMDCController;

public class Principal {

	public static void main(String[] args) {
		CalcMDCController mdc = new CalcMDCController();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro positivo para calcular o MDC: ");
		int a = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int b = input.nextInt();
		System.out.println("O MDC entre " + a + " e " + b + " é: " + mdc.calcMDC(a, b));
		input.close();
		System.exit(0);
	}

}
