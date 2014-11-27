package strings;

public class checkPalin {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Eva, can I see bees in a cave ?"));
	}

	private static int isPalindrome(String phrase) {
		String x="";
		for(int i=0;i<phrase.length();i++)
		{
			char c = phrase.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
				x+=c;
		}
		
		StringBuffer str = new StringBuffer(x);
		String y = str.reverse().toString();
		if(x.equalsIgnoreCase(y))return 1;
		return 0;
	}
}
