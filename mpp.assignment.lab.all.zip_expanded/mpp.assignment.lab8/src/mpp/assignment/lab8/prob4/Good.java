package mpp.assignment.lab8.prob4;

import java.util.ArrayList;
import java.util.List;

public class Good {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Good good = new Good();
		List<String> words = new ArrayList<>();
		words.add("arjun");
		words.add("khadka");
		words.add("smith");
		words.add("smitt");
		words.add("mithe");
		System.out.println(String.format(
				"words with names that contain s and do not contain e: " + good.countWords(words, 's', 'e', 5)));

	}

	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter(word -> word.length() == len && word.indexOf(c) >= 0 && word.indexOf(d) == -1).count();

	}
}
