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
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "UserID")
	private User user;
	private String description;
	private int difficulty;
	private int quality;
	private int requiredTime;
	
	
	public Recipe(int id, String name, User user, String description, int difficulty, int quality, int requiredTime) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.description = description;
		this.difficulty = difficulty;
		this.quality = quality;
		this.requiredTime = requiredTime;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getDifficulty() {
		return difficulty;
	}


	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}


	public int getQuality() {
		return quality;
	}


	public void setQuality(int quality) {
		this.quality = quality;
	}


	public int getRequiredTime() {
		return requiredTime;
	}


	public void setRequiredTime(int requiredTime) {
		this.requiredTime = requiredTime;
	}


	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", user=" + user + ", description=" + description
				+ ", difficulty=" + difficulty + ", quality=" + quality + ", requiredTime=" + requiredTime + "]";
	}
	

}
