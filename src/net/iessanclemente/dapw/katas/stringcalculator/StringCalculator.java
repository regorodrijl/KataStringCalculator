package net.iessanclemente.dapw.katas.stringcalculator;

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
			for (String aNumber : numberList) {
				result += Integer.parseInt(aNumber);
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
