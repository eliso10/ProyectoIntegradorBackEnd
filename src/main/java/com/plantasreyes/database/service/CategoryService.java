package com.plantasreyes.database.service;
import java.util.List;
import java.util.Locale.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plantasreyes.database.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	//Get
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();

	}
	
	//Get by Id
	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id).orElse(null);
	}
	
	//Post
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	// Put
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	//Delete (necesario por id)
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
	
	
}
