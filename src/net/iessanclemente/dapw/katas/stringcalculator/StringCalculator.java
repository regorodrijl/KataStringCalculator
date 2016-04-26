package net.iessanclemente.dapw.katas.stringcalculator;

import net.iessanclemente.dapw.katas.stringcalculator.exception.NegativeNotSupportedException;

public class StringCalculator {

	public int add(String txt) {
		int result = 0;
		if (txt.length() >= 1) {

			String separators = ",|\n";
			if (txt.startsWith("//")) {
				String custumSeparator = txt.substring(2, 3);
				txt = txt.substring(4);
				separators = ",|\n" + "|" + custumSeparator;
			}
			String[] numberList = txt.split(separators);
			Integer[] negatives = new Integer[numberList.length];

			int i = 0;
			for (String aNumber : numberList) {
				int n = Integer.parseInt(aNumber);
				if (n < 0) {
					negatives[i] = n;
					i++;
				}
				result += n;
			}
			if (i != 0) {
				throw new NegativeNotSupportedException(negatives);
			}
		}
		return result;
		/*
		 * // otra forma switch(txt.length()){ case 0: result = 0; break; case
		 * 1: result = Integer.parseInt(txt); break; default: String []
		 * numberList = txt.split(",|\n"); for(String aNumber : numberList){
		 * result += Integer.parseInt(aNumber); } break; } return result;
		 */
	}

}
