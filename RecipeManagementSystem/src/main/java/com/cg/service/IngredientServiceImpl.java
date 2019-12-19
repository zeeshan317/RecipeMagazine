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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredient searchByName(String ingredientName) {
		// TODO Auto-generated method stub
		return null;
	}

}
