package com.program.Java8;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FirstNonRepeatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str ="vvishnu";
		String str="vvisshnu is aa good";
		 Map<Character,Long> m= str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new,Collectors.counting()));
		 
		 
		 
		 //FIRST NON-REPEATING WORD
		 Character c=m.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
		 System.out.println("First Non repeating word :"+c);
		 
		 Character c1=m.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).skip(1).findFirst().get();
		 System.out.println("Second Non repeating word :"+c1);
		 
		 //FIRST REPEATING WORD
		 Character cc=m.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get();
		 System.out.println("First repeating word :"+cc);
		 
		 
		 Map<String, Long> m1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new ,Collectors.counting()));//we cant convert that into Character , we can use it only with String. To convert it into Character, we can use like above 
		
		 

		 String cz= m1.entrySet().stream().filter(a->a.getValue()==1).map(b->b.getKey()).findFirst().get();
		 System.out.println(cz);
		 
		 Entry<String, Long> e = m1.entrySet().stream().filter(a->a.getValue()==1).findFirst().get();
		 System.out.println("''''''''''"+e);
		 
	}

}
