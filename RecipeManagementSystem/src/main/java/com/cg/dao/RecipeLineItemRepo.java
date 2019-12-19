/**
 * 
 */
package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cg.dto.RecipeLineItem;

/**
 * @author mosabir
 *
 */
public interface RecipeLineItemRepo extends JpaRepository<RecipeLineItem, Integer>, PagingAndSortingRepository<RecipeLineItem, Integer> {

}
