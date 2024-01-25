package com.java.regex;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountOfWordInSentence {

	public static void main(String[] args) {
		String str="vishnu devi is good girl vishnu and vishnu are good ";
		int count=0;
		Pattern p=Pattern.compile("vishnu");
		Matcher m=p.matcher(str);
		while(m.find()) {
			count++;
			System.out.println(m.group()+" start at "+ m.start()+" and ends at "+m.end());
		}
		System.out.println(count);
		
		
		List<String> s =Arrays.stream(str.split(" ")).collect(Collectors.toList());
		Map<String,Long> hm =s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		hm.entrySet().stream().filter(e->e.getKey().equals("vishnu")).forEach(e->System.out.println(e.getValue()));
	
		//we can also write like below
		Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getKey().equals("vishnu")).forEach(e->System.out.println(e.getValue()));

	
	}

}
