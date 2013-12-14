public class ThePalindrome {

    public static Boolean isPalindrome(String s) {
	int len = s.length();
	int i;
	Boolean flag = true;
	for (i = 0; i < len / 2; i++) {
	    if (s.charAt(i) != s.charAt(len - i - 1)) {
		flag = false;
		break;
	    }
	} return flag;

    }

    public int find(String s) {
	int i, k;

	if (isPalindrome(s))
	    return s.length();
	int len = s.length();
	String temp = new String(s);
	for (i = 0; i < len; i++) {
	    s = new String(temp);
	    for (k = i; k >= 0; k--) {
		s = s + s.charAt(k);
	    }
	    if (isPalindrome(s))
		return s.length();
	}

	return 1;

    }


}
