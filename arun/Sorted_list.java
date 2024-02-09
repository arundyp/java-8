package com.arun;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_list {
	
public static void main(String[] args) {
		
		Integer arr[]= {1,9,3,2,4,6,32,5};
		
		 List<Integer> list = Arrays.asList(arr);
		

		//List<Integer> collect = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
