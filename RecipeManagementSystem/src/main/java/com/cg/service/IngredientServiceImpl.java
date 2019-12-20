package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IngredientRepo;
import com.cg.dto.Ingredient;

@Service
@Transactional

public class IngredientServiceImpl implements IngredientService {

	@Autowired
	private IngredientRepo ingRepo;

	@Override
	public List<Ingredient> listIngredient() {
		return ingRepo.listIngredient();
	}

	@Override
	public List<Ingredient> searchByName(String ingredientName) {
		return ingRepo.searchByName(ingredientName);
	}

	@Override
	public Ingredient addIngredient(Ingredient ingredient) {
		if (ingRepo.searchIngredient(ingredient.getId()) == null) {
			ingredient.setViewStatus(true);
			return ingRepo.save(ingredient);
		}
		else
			return null;
	}

	@Override
	public boolean deleteById(int id) {
		Ingredient ingredient = ingRepo.searchIngredient(id);
		if (ingredient == null) {
			return false;
		} else {
			ingredient.setViewStatus(false);
			ingRepo.save(ingredient);
			return true;
		}
	}

	@Override
	public Ingredient searchIngredient(int id) {
		if(ingRepo.searchIngredient(id) == null) {
			return null;
		}
		else {
			return ingRepo.searchIngredient(id);
		}
	}

}
