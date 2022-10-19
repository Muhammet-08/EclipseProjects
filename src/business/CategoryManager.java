package business;


import java.util.List;

import dataAccess.CategoryDao;
import entities.Category;
import logger.Logger;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		for(Category c : categories) {
			if(c.getCategoryName().equals(c.getCategoryName())) {
				throw new Exception("Kategori adı diğerleriyle aynı olamaz!");
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		for(Logger logger:loggers) {
			logger.add(category.getCategoryName());
		}
		
	}
	
	
	
}
