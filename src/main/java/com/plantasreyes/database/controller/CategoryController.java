package com.plantasreyes.database.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plantasreyes.database.entity.Category;
import com.plantasreyes.database.service.CategoryService;

@RequestMapping(path = "/database/category")
@RestController //ApiRESTfull
public class CategoryController {

	@Autowired
	private final CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	//GetAll
	@GetMapping
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}
	
	//Get individual
	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	//Post
	@PostMapping
	public Category createCategory (@RequestBody Category category) {
		return categoryService.createCategory(category);
	}
	
	//Put
	@PutMapping
	public Category updateCategory(@RequestBody Category category) {
		return categoryService.updateCategory(category);
	}
	
	
	//Delete
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
	}
	}