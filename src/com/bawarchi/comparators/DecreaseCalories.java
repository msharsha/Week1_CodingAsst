package com.bawarchi.comparators;
import java.util.Comparator;

import com.bawarchi.model.Dish;

public class DecreaseCalories implements Comparator<Dish> {

	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return Double.valueOf(o2.getCalories()).compareTo(o1.getCalories());
	}

}
