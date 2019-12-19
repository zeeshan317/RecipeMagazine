package com.cg.service;

import java.util.List;

import com.cg.dto.Ingredient;

public interface IngredientService {
	
	List<Ingredient> listIngredient();
	
	Ingredient searchByName (String ingredientName);

}
