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
@Table(name = "ingredient")
@NamedQuery(name = "byName", query = "SELECT ing FROM Ingredient ing WHERE ing.ingredientName= :ingredientName")
@NamedQuery(name = "listAll", query = "SELECT ing FROM Ingredient ing")
@NamedQuery(name = "delete", query = "DELETE FROM Ingredient ing WHERE ing.id= :id")

public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ingredientName;

	@Column(name = "ing_view")
	private boolean viewStatus;

	public Ingredient(int id, String ingredientName, boolean viewStatus) {
		super();
		this.id = id;
		this.ingredientName = ingredientName;
		this.viewStatus = viewStatus;
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
		return "Ingredient [id=" + id + ", ingredientName=" + ingredientName + ", viewStatus=" + viewStatus + "]";
	}

	public boolean getViewStatus() {
		return viewStatus;
	}

	public void setViewStatus(boolean viewStatus) {
		this.viewStatus = viewStatus;
	}
}
