package io.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();
		userList.add(new User("5f9a75f2f69d027b700504ba", "Lakshmikanth", "kanth@gmail.com", 9876543211L, 37500.77));
		userList.add(new User("5f9a75f2f69d027b700504bb", "Revanth", "rev@gmail.com", 9876543211L, 45699.99));
		userList.add(new User("5f9a75f2f69d027b700504bc", "Abhishek", "abhi@gmail.com", 9876543211L, 75999.99));
		userList.add(new User("5f9a75f2f69d027b700504bd", "Ankush", "ankush@gmail.com", 9876543211L, 34999.99));
		userList.add(new User("5f9a75f2f69d027b700504be", "Nagabhishek", "body@gmail.com", 9876543211L, 12500.00));
		userList.add(new User("5f9a75f2f69d027b700504bf", "Prakash", "prakash@gmail.com", 9876543211L, 66789.89));

		List<UserInfo> userInfoList = userList.stream().map(UserInfo::new).collect(Collectors.toList());
		List<String> userIdList = userList.stream().map(User::getId).collect(Collectors.toList());
		Double totalSalary = userList.stream().map(User::getSalary).reduce(0.0, (total, salary) -> total + salary);
		userList.stream().sorted(Comparator.comparing(User::getName)).forEach(System.out::println);
		userInfoList.forEach(System.out::println);
		System.out.println();
		userIdList.forEach(System.out::println);
		System.out.println();
		System.out.println(totalSalary);
		/*
		 * =====================================================================
		 * ======================================
		 */
		String names = "RamSheetaRajPiyush";
		List<Character> ch = names.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println(ch);
		/*
		 * =====================================================================
		 * ======================================
		 */
		Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8).limit(6)
				/*
				 * limit is set to 6, hence it will print the numbers starting
				 * from 0 to 5
				 */
				.forEach(num -> System.out.print("\n" + num));
		/*
		 * =====================================================================
		 * ======================================
		 */
	}

}
