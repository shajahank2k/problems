package mylearning;

public class Strings {

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		
		for(int i=s.length();i>0;i++) {
			if(s.charAt(i)=='#') {
				s.replace(s.charAt(i-1), ' ');
			}
		}
	}

}
