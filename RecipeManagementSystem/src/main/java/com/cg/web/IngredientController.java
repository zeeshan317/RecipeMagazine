/**
 * 
 */
package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.dto.Ingredient;
import com.cg.service.IngredientService;

/**
 * @author mosabir
 *
 */

@RestController

@RequestMapping("/ingredients")
public class IngredientController {

	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping(value= "/", produces = "application/json")
	public List<Ingredient> listIngredient() {
		return ingredientService.listIngredient();  
	}
	
	@GetMapping(value="/ingredientName", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ingredient> searchByName(@RequestParam String ingredientName){
		Ingredient ing = new Ingredient();
		ing = ingredientService.searchByName(ingredientName);
		return new ResponseEntity<Ingredient>(ing, HttpStatus.OK);
	}
	
}
