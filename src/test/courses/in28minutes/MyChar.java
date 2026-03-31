package test.courses.in28minutes;

public class MyChar {

	private char c;
	
	public MyChar(char c) {
		this.c = c;
	}
	
	public boolean isVowel() {
		//return "aeiouAEIOU".indexOf((int)c) > -1;
		switch (Character.toLowerCase(c)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}
		return false;
	}
	
	public boolean isAlphabetic() {
		//return Character.isAlphabetic(c);
		int ch = (int)c;
		if (ch >=97 && ch<=122) {
			return true;
		} else if (ch >=65 && ch<=90) {
			return true;
		}
		return false;
	}
	
	public boolean isNumber() {
		return Character.isDigit(c);
		//return "0123456789".indexOf((int)c) > -1;
	}
	
	public void printAllLowerCaseChars() {
		 for(char ch = 'a'; ch<'z';ch++) {
			 System.out.print(ch);
		 }
		 System.out.println();
	}
	
	public static void main(String[] args) {
		MyChar mc = new MyChar('I');
		System.out.println("isVowel:"+mc.isVowel());
		System.out.println("isAlphabetic:"+mc.isAlphabetic());
		System.out.println("isNumber:"+mc.isNumber());
		System.out.println("a="+(int)'a');
		System.out.println("z="+(int)'z');
		System.out.println("A="+(int)'A');
		System.out.println("Z="+(int)'Z');
		
		mc.printAllLowerCaseChars();
	}

}
