package Lesson8.Prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(String[] args) {
		Good good = new Good();
		
		List<String> words = new ArrayList<String>();
		words.add("Happy");
		words.add("Bright");
		words.add("Light");
		words.add("Right");
		words.add("Eight");
		words.add("White");
		words.add("Black");
		words.add("Rainy");
		
		System.out.println("5-letter words with i, and without e: " + countWords(words, 'i', 'e', 5));
	}
	
	
	public static int countWords(List<String> words, char c, char d, int len) {
//		return (int) words.stream().filter(word -> word.length() == len && word.indexOf(c)>=0 && word.indexOf(d)==-1).count();
		
		return 
				words.stream()
					.filter(name -> name.contains(Character.toString(c)))
					.filter(name -> !name.contains(Character.toString(d)))
					.filter(name -> name.length() == len)
					.collect(Collectors.toList())
					.size();
	}
}
