/**
 * 
 */
package com.cg.dto;

import javax.persistence.*;


/**
 * @author mosabir
 *
 */

@Entity
public class RecipeLineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "RecipeID")
	private Recipe recipe;
	@ManyToOne
	@JoinColumn(name = "IngredientID")
	private Ingredient ingredient;
	
	public RecipeLineItem(int id, Recipe recipe, Ingredient ingredient) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.ingredient = ingredient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return "RecipeLineItem [id=" + id + ", recipe=" + recipe + ", ingredient=" + ingredient + "]";
	}
	
	
}
