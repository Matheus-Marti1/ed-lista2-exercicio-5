package controller;

public class CalcMDCController {

	public CalcMDCController() {
		super();
	}

	public int calcMDC(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return calcMDC(b, (a % b));
		}
	}

}
