package test.courses.in28minutes.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExcersice {

	public static void main(String[] args) {
		String str = "Put blue items in a Blue box and red items in Red box";
		wordFrequecyCounter(str);
	}
	
	private static void wordFrequecyCounter(String str) {
		String [] tokens = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		String trimmedToken = null;
		for (String token: tokens) {
			trimmedToken = token.trim().toLowerCase();
			if (!trimmedToken.isBlank()) {
				map.put(trimmedToken, 1 + map.getOrDefault(trimmedToken, 0));
			}
		}
		System.out.println("wordFrequecyCounter:"+map);
	}
	
	// str = "This is a great thing"
	// Q1: list the frequency of characters in above str
	// Q2: count number of words in above str
	public static void solution1(String str) {
		// TODO Auto-generated method stub
		String [] tokens = str.split(" ");
		int totalLength = 0;
		Map<Character, Integer> mapOfCharVsFrequency = new HashMap<>();
		List<String> words = new ArrayList<>();
		int f = 0;
		char c = 0;
		for (String s: tokens) {
			if (!s.isBlank()) {
				words.add(s);
				totalLength += s.length();
				for (int i = 0; i< s.length(); i++) {
					c = s.charAt(i);
					if (mapOfCharVsFrequency.containsKey(c)) {
						f = mapOfCharVsFrequency.get(c);
					} else {
						f = 0;
					}
					mapOfCharVsFrequency.put(c, ++f);
				}
			}
		}
		System.out.println("numbert of words = "+words.size());
		System.out.println("number of chars:"+totalLength);
		System.out.println("charecter frequency"+mapOfCharVsFrequency);
	}

}
