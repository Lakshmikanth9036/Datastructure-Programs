package io.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(3, "three");
		map.put(2, "two");
		map.put(5, "five");	
		map.put(4, "four");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("==================================");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("==================================");
		//Map<User, Integer> objMap = new TreeMap<User, Integer>((o1,o2) -> (int)(o1.getSalary()-o2.getSalary()));
		Map<User, Integer> objMap = new HashMap<User, Integer>();
		objMap.put(new User("5f9a75f2f69d027b700504ba", "Lakshmikanth", "kanth@gmail.com", 9876543211L, 37500.77), 016);
		objMap.put(new User("5f9a75f2f69d027b700504bb", "Revanth", "rev@gmail.com", 9876543211L, 45699.99), 024);
		objMap.put(new User("5f9a75f2f69d027b700504bc", "Abhishek", "abhi@gmail.com", 9876543211L, 75999.99), 001);
		objMap.put(new User("5f9a75f2f69d027b700504bd", "Ankush", "ankush@gmail.com", 9876543211L, 34999.99), 021);
		objMap.put(new User("5f9a75f2f69d027b700504be", "Nagabhishek", "body@gmail.com", 9876543211L, 12500.00), 011);
		
		objMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getName))).forEach(System.out::println);
		System.out.println("==================================");
		objMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getName).reversed())).forEach(System.out::println);
	}
}
