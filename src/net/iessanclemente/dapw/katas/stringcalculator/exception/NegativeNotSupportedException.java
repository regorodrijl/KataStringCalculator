package net.iessanclemente.dapw.katas.stringcalculator.exception;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 import java.util.Arrays;
 import java.util.function.Function;
 import java.util.stream.Collectors;
 */
public class NegativeNotSupportedException extends IllegalArgumentException {
	private Integer[] negatives;

	public NegativeNotSupportedException(Integer[] negatives) {
		super("Negativos no soportados"
				+ String.join(
						", ",
						(String[]) Arrays.asList(negatives).stream()
								.map(new Function<Integer, String>() {
									@Override
									public String apply(Integer t) {
										// TODO Auto-generated method stub
										return "" + t;
									}
								}).collect(Collectors.toList())
								.toArray(new String[negatives.length])));
		this.negatives = negatives;
	}

	public Integer[] getNegatives() {
		return negatives;
	}
}