package mercury;

import java.util.LinkedList;

public class test2 {

	public static Double getResult(String s) {
		if (s == null || s.length() == 0)
			return null;

		LinkedList<String> list = new LinkedList<String>();
		StringBuffer sb = new StringBuffer();
		s = s.replaceAll(" ", "");

		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == '+' || temp == '-' || temp == '*' || temp == '/') {
				// first add values to the list then add the operator to the
				// list
				String num = sb.toString();
				if (num.length() < 1 && i == 0) {
					list.add("0");
				} else {
					list.add(num);
				}
				sb.delete(0, sb.length());
				list.add(String.valueOf(temp));
			} else {
				// if i is not reaching to the end of the string, append the
				// number to stringbuffer
				if (i != s.length() - 1) {
					sb.append(temp);
				} else {
					// i is the end of the string, add the value to list
					sb.append(temp);
					String num = sb.toString();
					if (num.length() < 1) {
						list.add("0");
					} else {
						list.add(num);
					}
					sb.delete(0, sb.length());
				}
			}
		}

		// calculate * and / first
		try {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals("*")) {
					double temp = Double.parseDouble(list.get(i - 1))
							* Double.parseDouble(list.get(i + 1));

					list.set(i - 1, String.valueOf(temp));
					list.remove(i);
					list.remove(i);
					i--;
				} else if (list.get(i).equals("/")) {
					double temp = Double.parseDouble(list.get(i - 1))
							/ Double.parseDouble(list.get(i + 1));

					list.set(i - 1, String.valueOf(temp));
					list.remove(i);
					list.remove(i);
					i--;
				}
			}
		} catch (Exception e) {
			System.out
					.println("Error: the input string contains illegal character");
			return null;
		}

		// calculate + and -
		try {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals("+")) {
					double temp = Double.parseDouble(list.get(i - 1))
							+ Double.parseDouble(list.get(i + 1));

					list.set(i - 1, String.valueOf(temp));
					list.remove(i);
					list.remove(i);
					i--;
				} else if (list.get(i).equals("-")) {
					double temp = Double.parseDouble(list.get(i - 1))
							- Double.parseDouble(list.get(i + 1));

					list.set(i - 1, String.valueOf(temp));
					list.remove(i);
					list.remove(i);
					i--;
				}
			}
		} catch (Exception e) {
			System.out
					.println("Error: the input string contains illegal character");
			return null;
		}

		// keep only one digit after dot. 12.5000000001->12.5;
		double result = (double) Math
				.round(Double.parseDouble(list.get(0)) * 10) / 10;
		return result;
	}

	public static void main(String[] args) {
		// test 1: "5.6/0.7*2-3.5"
		System.out.println(getResult("5.6/0.7*2-3.5"));

		// test 2: "-1.3 + 5.1 / 3 �C 0.8" with spaces
		System.out.println(getResult("-1.3 + 5.1 / 3 - 0.8"));

		// test input = "" or null
		System.out.println(getResult(null));
		System.out.println(getResult(""));

		// test input with illegal char "5.6/]0.7*2-3.5"
		// try - catch piece will print "the input contains illegal char" and
		// return null
		System.out.println(getResult("5.6/3.1+]+0.7*2-3.5"));

		// test input with illegal operator "5.6/0.7*+2-3.5"
		System.out.println(getResult("5.6/0.7**+2-3.5"));

		// test with large number: "1233314/18293+23000-0.4*315"
		System.out.println(getResult("1233314/18293+23000-2*315"));
	}

}
