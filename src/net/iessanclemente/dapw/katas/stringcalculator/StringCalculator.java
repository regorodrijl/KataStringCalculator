package net.iessanclemente.dapw.katas.stringcalculator;

public class StringCalculator {

	public int add(String txt) {
		int result = 0;
		switch(txt.length()){
		case 0:
			result = 0;
			break;
		case 1:
			result = Integer.parseInt(txt);
			break;
		default:
			String [] numberList = txt.split(",|\n");
			for(String aNumber : numberList){
				result += Integer.parseInt(aNumber);
			}
			break;
		}
		return result;
	}

}
