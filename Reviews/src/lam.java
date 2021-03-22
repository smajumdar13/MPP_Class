import java.util.List;
import java.util.stream.Stream;

public class lam {

	public static void main(String[] args) {
//		System.out.println(lenthOfLongerWord("Hello", "Bye"));
		String s1 = "Hello";
		String s2 = "Bye";
//		int lengthOfLongerWord = List.of(s1, s2).stream().
	}
	
	public static int lenthOfLongerWord(String s1, String s2) {
		int s = s1.length()>s2.length() ? s1.length() : s2.length();
		
		
		return s;
	}
}
