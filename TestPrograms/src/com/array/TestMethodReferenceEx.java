package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestMethodReferenceEx {
		
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
			
		int[] ints = {1,2,3};
		List<Integer> list2 = IntStream.of(ints).boxed().collect(Collectors.toList());
		
		System.out.println(list2); 
			
		// Using an anonymous class
		Numbers.findNumbers(list, new BiPredicate<Integer, Integer>() {
		  public boolean test(Integer i1, Integer i2) {
		    return Numbers.isMoreThanFifty(i1, i2);
		  }
		});

		// Using a lambda expression
		Numbers.findNumbers(list, (i1, i2) -> Numbers.isMoreThanFifty(i1, i2));

		// Using a method reference
		System.out.println(Numbers.findNumbers(list, Numbers::isMoreThanFifty));

	}
}
