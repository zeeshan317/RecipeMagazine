/**
 * 
 */
package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cg.dto.Ingredient;

/**
 * @author mosabir
 *
 */
public interface IngredientRepo extends JpaRepository<Ingredient, Integer> , PagingAndSortingRepository<Ingredient, Integer>{
	
	@Query("SELECT ing FROM Ingredient ing WHERE ing.id = :id AND ing.viewStatus = TRUE")
	Ingredient searchIngredient(int id);	
	
	@Query("SELECT ing FROM Ingredient ing WHERE ing.ingredientName = :ingredientName AND ing.viewStatus = TRUE")
	List<Ingredient> searchByName(String ingredientName);

	@Query("SELECT ing FROM Ingredient ing WHERE ing.viewStatus = TRUE")
	List<Ingredient> listIngredient() ;
	
	@Query("DELETE FROM Ingredient ing WHERE ing.id = :id")
	void deleteById(String id);
}
