/**
 * 
 */
package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.cg.dto.Ingredient;
import com.cg.service.IngredientService;

/**
 * @author mosabir
 *
 */

@RestController

@RequestMapping("/ingredients")

@Validated
public class IngredientController {

	@Autowired
	private IngredientService ingredientService;

	@GetMapping(value = "/", produces = "application/json")
	public List<Ingredient> listIngredient() {
		return ingredientService.listIngredient();
	}

	
	@PostMapping(value = "/add")
	public  ResponseEntity<?> addIngredient( @ModelAttribute Ingredient ing){
		Ingredient temp = ing;
		
		Ingredient ingredient = ingredientService.addIngredient(ing);
		if(ingredient == null)
	}
	
	
	@GetMapping(value = "/ingredientName", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ingredient>> searchByName(@RequestParam String ingredientName) {
		List<Ingredient> ingredients;
		ingredients = ingredientService.searchByName(ingredientName);
		return new ResponseEntity<List<Ingredient>>(ingredients, HttpStatus.OK);
	}

	@GetMapping(value = "/delete")
	public ResponseEntity<String> deleteById(@RequestParam("id") int id) {
		boolean flag = ingredientService.deleteById(id);

		if (flag != true) {
			return new ResponseEntity<String>("Deleted successfully", HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<String>("Not deleted.", HttpStatus.OK);
		}
	}

}
