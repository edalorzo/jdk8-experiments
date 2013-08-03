package codemasters.lambda.linq;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;
import java.util.function.ToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Comparator;
import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.Comparator.comparing;

public class Demo2 {
	
	public static void main(String[] args) {
		
	}
	
	public static void test01() {
		stream("I You Love".split(" ")).sorted()
		  .forEach(System.out::println);
	}
	
	/*
	public static void test02() {
		String[] names = {"Sam","Pamela", "Dave", "Pascal", "Erik"};
		List<String> filteredNames = stream(names)
						.filter(c -> c.contains("am"))
						.collect(toList());
			                              
        System.out.println(filteredNames);			                              
	}*/
	
	/*
	public static void test03() {
		String[] names = {"Sam","Pamela", "Dave", "Pascal", "Erik"};
		
		List<String> nameList;
		Stream<Integer> indices = intRange(1, names.length).boxed(); 
		nameList = zip(indices, stream(names),SimpleEntry::new)
					.filter(e -> e.getValue().length() <= e.getKey())
					.map(Entry::getValue)
					.collect(toList());
					
        System.out.println(nameList);					
	}*/
	
	public static void test04() {
		List<String> nameList1 = asList("Anders", "David", "James", "Jeff", "Joe", "Erik");
		nameList1.stream()
				 .map(c -> "Hello! " + c)
				 .forEach(System.out::println);
	}
	
	/*
	public static void test05() {
		Map<String, List<String>> map = new LinkedHashMap<>();
		map.put("UK", asList("Bermingham","Bradford","Liverpool"));
		map.put("USA", asList("NYC","New Jersey","Boston","Buffalo"));
		
		FlatMapper<Entry<String, List<String>>,String> flattener; 
		flattener = (e,c) -> { e.getValue().forEach(c); };
		
		List<String> cities = map.entrySet()
								 .stream()
								 .flatMap( flattener )
								 .collect(toList());

		Iterable<String> iter = () -> cities.stream().iterator(); 										 
		for(String city: iter){
			System.out.println(city);
		}
		                         
	    //Function<Entry<String,List<String>>, Stream<? extends String>> flattener;
		//flattener = e -> e.getValue().stream(); 		                         
		   
        System.out.println(cities);		   
	}
	*/
	/*
	public static void test06() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13 };
		
		List<Integer> firstFour;
		firstFour = stream(numbers).limit(4)
		                           .boxed()
		                           .collect(toList());
		
		System.out.println(firstFour);
	}
	*/
	
	public static void test07() {
		String[] names  = { "Sam","Samuel","Dave","Pascal","Erik","Sid" };
		
		List<String> sNames;
		sNames = stream(names).collect(partitioningBy(c -> c.startsWith("S")))
							  .get(true);
		
		System.out.println(sNames);
	}
	
	/*
	public static void test08() {
		String[] vipNames = { "Sam", "Samuel", "Samu", "Remo", "Arnold","Terry" };
		
		List<String> skippedList;
		skippedList = stream(vipNames).substream(3).collect(toList());
		
		System.out.println(skippedList);
	}
	*/
	
	/*
	public static void test09() {
		String[] friends = { "Sam", "Pamela", "Dave", "Anders", "Erik" };
		friends = stream(friends).sorted(comparingInt(String::length))
								 .toArray(String[]::new);
		
		System.out.println(asList(friends));
	}
	*/
	
	public static void test10() {
		String[] names = {"Sam", "Samuel", "Samu", "Ravi", "Ratna",  "Barsha"};
		
		Map<Integer,List<String>> groups;
		groups = stream(names).collect(groupingBy(String::length));
		
		System.out.println(groups);
	}
	
	public static void test11() {
		String[] songIds = {"Song#1", "Song#2", "Song#2", "Song#2", "Song#3", "Song#1"};
		stream(songIds).distinct();
	}
	
	/*
	public static void test12() {
		List<String> friends1 = asList("Anders","David","James","Jeff","Joe","Erik");
		List<String> friends2 = asList("Erik","David","Derik");
		Stream<String> allMyFriends = concat(friends1.stream(), 
			                                 friends2.stream()).distinct();
			
	}*/
	
	public static void test13() {
		String[] otherFriends = {"Sam", "Danny", "Jeff", "Erik", "Anders","Derik"};
		Optional<String> found = stream(otherFriends).findFirst();
		
		Optional<String> maybe = stream(otherFriends).filter(c -> c.length() == 5)
												   .findFirst();
		if(maybe.isPresent()) {
				//do something with found data
		}
	}
	
	/*
	public static void test14() {
		IntStream multiplesOfEleven = intRange(1,100).filter(n -> n % 11 == 0);
	}
	*/
	
	public static void test15() {
		String[] persons = {"Sam", "Danny", "Jeff", "Erik", "Anders","Derik"};
		boolean x = stream(persons).anyMatch(c -> c.length() == 5);
	}

	/*	
	public static void test16() {
		String[] salutations = {"Mr.", "Mrs.", "Ms", "Master"};
		String[] firstNames = {"Samuel", "Jenny", "Joyace", "Sam"};
		String lastName = "McEnzie";
		
		zip(stream(salutations), stream(firstNames), (sal,first) -> sal + " " +first)
			.forEach(c -> { System.out.println(c + " " + lastName); });
		
	}
	*/
	
	public static void test17() {
		String[] fruits = {"grape", "passionfruit", "banana",
                            "apple", "orange", "raspberry",
                            "mango", "blueberry" };
                            
		Comparator<String> comparator;
		comparator = comparing((Function<String,Integer>)String::length, Integer::compare)
                     .thenComparing((Comparator<String>)String::compareTo);                                    
                            
	    fruits = stream(fruits)	.sorted(comparator)
                                 .toArray(String[]::new);                            
                            
	}
	
	
	
	
}
