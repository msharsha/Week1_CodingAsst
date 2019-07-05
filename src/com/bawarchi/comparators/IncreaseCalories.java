package com.bawarchi.comparators;
import java.util.Comparator;

import com.bawarchi.model.Dish;

public class IncreaseCalories implements Comparator<Dish> {

	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return Double.valueOf(o1.getCalories()).compareTo(o2.getCalories());
	}

}
