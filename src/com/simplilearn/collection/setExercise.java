package com.simplilearn.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setExercise {

	public static void main(String[] args) {
		
		Set<Double> priceSet = new HashSet<> ();
		
		priceSet.add(299.00);
		priceSet.add(100.00);
		priceSet.add(345.50);
		
		System.out.println("Price Will Be :"+priceSet);
		
		Set<Integer> numberSet = new LinkedHashSet<> ();
		
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(30);
		
		System.out.println("Number Will Be :"+numberSet);
		
		Set<Float> temperatureSet = new TreeSet<>();
		
		temperatureSet.add((float) 50);
		temperatureSet.add((float) 40);
		temperatureSet.add((float) 50);
		
		System.out.println("Temperature will be :"+temperatureSet);
		
	}
		

}
