package net.iessanclemente.dapw.katas.stringcalculator;

public class StringCalculator {

	public int add(String txt) {
		if(txt.length() > 0)
			return Integer.parseInt(txt);
		return 0;
	}

}
