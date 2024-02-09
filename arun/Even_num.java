package com.arun;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_num {
	public static void main(String[] args) {
		
		Integer arr[]= {1,9,3,2,4,6,32,5};
		
		 List<Integer> list = Arrays.asList(arr);
		
//		list.add(12);
//		list.add(13);
//		list.add(15);
//		list.add(14);
//		list.add(1);
//		list.add(11);
//		list.add(3);
		
		List<Integer> collect = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		//List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
