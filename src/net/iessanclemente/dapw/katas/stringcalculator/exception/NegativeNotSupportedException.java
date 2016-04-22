package net.iessanclemente.dapw.katas.stringcalculator.exception;

public class NegativeNotSupportedException extends IllegalArgumentException {
	private int[] negatives;

	public NegativeNotSupportedException(int[] negatives) {
		this.negatives = negatives;

		// super("Negativos no soportados" + String.join(", ", this.negatives));
	}
}
