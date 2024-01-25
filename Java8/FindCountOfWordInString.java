package com.program.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="vishnu devi is good girl vishnu and vishnu are good ";
		
		
		List<String> s =Arrays.stream(str.split(" ")).collect(Collectors.toList());
		Map<String,Long> hm =s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		hm.entrySet().stream().filter(e->e.getKey().equals("vishnu")).forEach(e->System.out.println("Vishnu appeared for "+e.getValue()+" times"));

		//we can also write like below
		Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getKey().equals("vishnu")).forEach(e->System.out.println(e.getValue()));

		
	}

}
