package com.program.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StringReverse {

	public static void main(String[] args) {
		
		String[] s = {"vishnu","devi","vinu"};
		
		List<String> l = Arrays.asList(s);
		
		List<StringBuffer> s1=l.stream().map(e->new StringBuffer(e).reverse()).collect(Collectors.toList());
		System.out.println(s1);
		s1.stream().forEach(System.out::println);
		
		System.out.println("STRING REVERSE");
		
		//Reverse each word in a string
		String str="Vishnu devi";
		String ss = Arrays.stream(str.split(" ")).map(e->new StringBuffer(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(ss);
		
		
		Stream.of(str).forEach(System.out::println);
		
		System.out.println("******Reversing whole string********");
		List<StringBuffer> d =Stream.of(str).map(e->new StringBuffer(e).reverse()).collect(Collectors.toList());
		System.out.println(d);//Collecting in list
		
		Stream.of(str).map(e->new StringBuffer(e).reverse()).forEach(e->System.out.println(e));
		
		
		String st = "vishnu";
		List<String> sss = Arrays.stream(st.split("")).collect(Collectors.toList());	
		System.out.println(sss);
		
		//Arrays.stream(st.split("")).;--I dont know how to apply sream API function here after converting to array to reverse it
		
		Stream.of(st).map(e->new StringBuffer(e).reverse()).forEach(e->System.out.println(e)); //capable OF converting anything to stream to apply Stream API FUNCTION.
		Stream.of(st).map(e->new StringBuffer(e).reverse()).forEach(System.out::println);
		
		char[] charArray = "Aniruddh".toCharArray();
	    IntStream.range(0, charArray.length)
	        .mapToObj(i -> charArray[(charArray.length - 1) - i])
	        .forEach(System.out::print);
	}

}
