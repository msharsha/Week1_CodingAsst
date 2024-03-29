package com.bawarchi.client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.bawarchi.comparators.DecreaseCalories;
import com.bawarchi.comparators.DecreasePrice;
import com.bawarchi.comparators.IncreaseCalories;
import com.bawarchi.comparators.IncreasePrice;
import com.bawarchi.model.Dish;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ArrayList<Dish> list = new ArrayList<>();
		Dish dish1 = new Dish(5,"Neer-Dosa",50.00,100);
		Dish dish2 = new Dish(2,"Idli-Vada",40.00,200);
		Dish dish3 = new Dish(4,"Roti-Curry",100.00,250);
		Dish dish4 = new Dish(1,"Dosa",50.00,300);
		Dish dish5 = new Dish(3,"Pulav",80.00,350);
		
		list.add(dish1);
		list.add(dish2);
		list.add(dish3);
		list.add(dish4);
		list.add(dish5);
		Scanner sc = new Scanner(System.in);
		System.out.println("=================Welcome=====================");
		System.out.println("Please choose from the below options \r\n");
		System.out.println("1 => To sort the dishes in the increasing order of calories");
		System.out.println("2 => To sort the dishes in the decreasing order of calories");
		System.out.println("3 => To sort the dishes in the increasing order of price");
		System.out.println("4 => To sort the dishes in the decreasing order of price");
		System.out.println("===============================================");
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			Collections.sort(list,new IncreaseCalories());
			System.out.println("Resulted list :");
			for(Dish val: list) {
				System.out.println("DishId: "+val.getDishId()+" Name "+val.getName()+" Price: "+val.getPrice()+" Calories: "+val.getCalories());
			}
			break;
		case 2:
			Collections.sort(list,new DecreaseCalories());
			System.out.println("Resulted list :");
			for(Dish val: list) {
				System.out.println("DishId: "+val.getDishId()+" Name "+val.getName()+" Price: "+val.getPrice()+" Calories: "+val.getCalories());
			}
			break;
		case 3:
			Collections.sort(list,new IncreasePrice());
			System.out.println("Resulted list :");
			for(Dish val: list) {
				System.out.println("DishId: "+val.getDishId()+" Name "+val.getName()+" Price: "+val.getPrice()+" Calories: "+val.getCalories());
			}
			break;
		case 4:
			Collections.sort(list, new DecreasePrice());
			System.out.println("Resulted list :");
			for(Dish val: list) {
				System.out.println("DishId: "+val.getDishId()+" Name "+val.getName()+" Price: "+val.getPrice()+" Calories: "+val.getCalories());
			}
			break;
		default:
			System.out.println("Please enter valid option");
			break;
		}
		sc.close();
		
	}

}
