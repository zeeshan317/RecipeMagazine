/**
 * 
 */
package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cg.dto.Recipe;

/**
 * @author mosabir
 *
 */
public interface RecipeRepo extends JpaRepository<Recipe, Integer>, PagingAndSortingRepository<Recipe, Integer> {

}
