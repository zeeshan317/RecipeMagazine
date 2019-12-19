/**
 * 
 */
package com.cg.dto;

import javax.persistence.*;

/**
 * @author mosabir
 *
 */
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ingredientName;
	
	public Ingredient(int id, String ingredientName) {
		this.id = id;
		this.ingredientName = ingredientName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIngredient() {
		return ingredientName;
	}

	public void setIngredient(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", ingredientName=" + ingredientName + "]";
	}
}
