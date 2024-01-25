package com.program.Java8;


import java.util.*;
import java.util.stream.IntStream;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[]{"A","B","C","D","E"};//we can also do final keyword to make string[] constant
		System.out.println(Arrays.toString(arr));

		Object[] reversedArr = IntStream.rangeClosed(1, arr.length)
		    .mapToObj(i -> arr[arr.length - i])
		    .toArray();

		System.out.println(Arrays.toString(reversedArr));
		
		IntStream.range(0, arr.length)
		.mapToObj(i->arr[(arr.length-1)-i])
		.forEach(System.out::println);
		
		
		//Try doing filter and other logic like last two odd and even number in reversed array by using java8
		
	}

}
