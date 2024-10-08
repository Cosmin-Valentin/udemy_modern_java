package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App2 {

	public static void main(String[] args) {

		List<Set<String>> exercitii = new ArrayList<>();
		
		exercitii.add(new HashSet<String>(Set.of("atarnari 3ff", "atarnari 3bf", "atarnari 4mm")));
		exercitii.add(new HashSet<String>(Set.of("campus 2 alt", "campus 1-3-5", "campus 1-4-6")));
		exercitii.add(new HashSet<String>(Set.of("tractiuni 3x5", "tractiuni +20kg", "circuite")));
		
		for(var day: exercitii) {
			for (var exercitiu: day) {
				System.out.print(exercitiu + ", ");
 				System.out.print("");
			}
			System.out.println();
		}
	}
}
