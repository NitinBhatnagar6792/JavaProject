package courses.in28minutes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("Mango", "Apple", "Orange", "Bat", "Cat");
		List<String> wordsList1 = new ArrayList<>(words);
		List<String> wordsList2 = new ArrayList<>(words);
		
		// below code is considered bad as we are removing element while looping
		for (String word: wordsList1) {
			if(word.endsWith("at")) wordsList1.remove(word);
		}
		System.out.println("wordsList1:"+wordsList1);
		// below code word properly - Need to understand??
		Iterator<String> itr = wordsList2.iterator();
		while(itr.hasNext()) {
//			String word = itr.next(); 
//			if(word.endsWith("at")) wordsList2.remove(word);
			if(itr.next().endsWith("at")) itr.remove();
		}
		
		System.out.println("wordsList2:"+wordsList2);
		Collections.sort(wordsList2);
		System.out.println("sorted wordsList2:"+wordsList2);
		Collections.reverse(wordsList2);
		System.out.println("rev sorted wordsList2:"+wordsList2);
		
//		//Collections.sort(wordsList1, Collections.reverseOrder());
//		System.out.println("rev wordsList1:"+wordsList1);
		
		
	}

}
