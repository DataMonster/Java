package mercury;

public class test1 {

	// Assume the string will only contains ASCII codes. As a result, the
	// dictionary length is 256.
	// define this method as static, so we can directly call it from main method
	public static Character check(String s) {
		if (s == null || s.length() == 0)
			return null;
		int[] letters = new int[256];
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] > s.length() / 2) {
				return (char) i;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// method check is static, no need to new a test1 object
		// test the case: "abadacababaaaa"
		System.out.println(check("abadacababaaaa"));

		// test the case: "abcdeabbad"
		System.out.println(check("abcdeabbad"));

		// test the case: "aaabbb"
		System.out.println(check("aaabbb"));
		
		// test other cases: "" and null
		System.out.println(check(""));
		System.out.println(check(null));

		// test other cases(more than only english chars): "a--s-d-fgs--a---"
		System.out.println(check("a++s+d-f+++++++!-"));

	}

}
