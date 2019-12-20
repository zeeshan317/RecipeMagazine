package com.cg.service;

import java.util.List;

import com.cg.dto.Ingredient;

public interface IngredientService {
	
	Ingredient addIngredient(Ingredient ingredient);
	
	List<Ingredient> listIngredient();
	
	Ingredient searchIngredient (int id);
	
	List<Ingredient> searchByName (String ingredientName);
	
	boolean deleteById(int id);

}
