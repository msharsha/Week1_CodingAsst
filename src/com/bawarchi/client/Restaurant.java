package com.bawarchi.client;
import java.util.ArrayList;
import java.util.Scanner;

import com.bawarchi.model.Dish;

public class Restaurant {

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
				for(Dish val: list) {
					System.out.println("DishId: "+val.getDishId()+" Name "+val.getName()+" Price: "+val.getPrice()+" Calories: "+val.getCalories());
				}
				System.out.println("===============================================");
				System.out.println("Enter Dish Id:");
				int id = sc.nextInt();
				int flag=0;
				for(Dish val: list) {
					if(val.getDishId() == id) {
						flag=1;
						System.out.println("==========You have selected "+val.getName()+"==========");
					}
				}
				if(flag==0) {
					System.out.println("=========Please enter a valid ID==========");
					System.exit(0);
				}
				else {
					System.out.println("Please enter your name:");
					String name = sc.next();
					for(Dish val: list) {
						if(val.getDishId() == id) {
							System.out.println("Please pay the bill of "+ val.getPrice());
							
						}
					}
					double price = sc.nextDouble();
					for(Dish val: list) {
						if(val.getDishId() == id) {
							if(price>val.getPrice()) {
								double change = price-val.getPrice();
								System.out.println("========Thanks for your order. "+name+" Please collect the change = Rs."+change);
							}
							else if(price<val.getPrice()) {
								System.out.println("========Amount paid is less than Bill Amount ================");
							}
							else {
								System.out.println("========Thanks for your order "+name+". ================");
							}
						}
					}
					sc.close();
					
				}
				
				
				
	}

}
