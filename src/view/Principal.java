package view;

import java.util.Scanner;

import controller.CalcMDCController;

public class Principal {

	public static void main(String[] args) {
		CalcMDCController mdc = new CalcMDCController();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro positivo para calcular o MDC: ");
		int a = input.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int b = input.nextInt();
		System.out.println("O MDC entre " + a + " e " + b + " �: " + mdc.calcMDC(a, b));
		input.close();
		System.exit(0);
	}

}
