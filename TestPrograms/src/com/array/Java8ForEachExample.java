package com.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Java8ForEachExample {

	public static <T> void main(String[] args) {
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		myList.forEach((i) ->{
			System.out.println(i);
		});
	//	myList.forEach(i -> System.out.print(i));
		myList.forEach(System.out::print); 
		
		myList.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1,Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		myList.sort((o1,o2) -> {
				return o1.compareTo(o2);
		});
		
		myList=myList.stream().filter(t -> t < 6).collect(Collectors.toList());
		System.out.println("");
		myList.forEach(System.out::print);
		
		//int sum = myList.stream().reduce(0, (x, y) -> x+y);
		Integer sum = myList.stream().reduce(new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		}).get();
		
		System.out.println("\nsum :"+sum);

	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}
