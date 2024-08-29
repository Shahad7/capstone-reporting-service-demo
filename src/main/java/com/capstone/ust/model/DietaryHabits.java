package com.capstone.ust.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DietaryHabits extends Category{
	private double meat_consumption;
	private double dairy_cosumption;
	private double other_consumpotion;
	private double emission;
}
