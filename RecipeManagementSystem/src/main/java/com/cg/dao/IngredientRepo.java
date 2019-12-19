/**
 * 
 */
package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cg.dto.Ingredient;

/**
 * @author mosabir
 *
 */
public interface IngredientRepo extends JpaRepository<Ingredient, Integer> , PagingAndSortingRepository<Ingredient, Integer>{

}
