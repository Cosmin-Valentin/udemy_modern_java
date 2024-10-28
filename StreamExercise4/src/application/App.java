package application;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

	public static void main(String[] args) {

//		Stream.of(1,2,3,4,5,6,7,8,9,10,11,12).forEach(n -> {
//			Stream.of(1,2,3,4,5,6,7,8,9,10,11,12).forEach(s -> {
//				System.out.printf("%-5d", s * n);
//			});
//			System.out.println();
//		});

//		IntStream.range(1, 13).forEach(n -> {
//			IntStream.range(1, 13).forEach(k -> {
//				int value = n * k;
//				System.out.printf("%-5d", value);
//			});
//			System.out.println();
//		});
		
		// @formatter: off
		
		var table = IntStream
			.range(1,13)
			.mapToObj(n -> {
				
				return IntStream
					.range(1, 13)
					.map(k -> k * n)
					.mapToObj(Integer::toString)
					.map(s -> String.format("%4s", s))
					.collect(Collectors.joining());
			})
			.collect(Collectors.joining("\n"));
		
		// @formatter: on
		
		System.out.println(table);
	}
}
