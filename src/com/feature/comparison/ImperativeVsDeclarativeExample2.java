package com.feature.comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2,1,10,21,10);
		/**
		 * Imperative
		 */
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer integer : integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("Unique List : " + uniqueList);
		
		/**
		 * Declarative
		 */
		List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique List1 : " + uniqueList1);
	}

}
