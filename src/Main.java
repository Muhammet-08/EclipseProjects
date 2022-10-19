import business.CategoryManager;
import dataAccess.HibernateCategoryDao;
import entities.Category;
import logger.DatabaseLogger;
import logger.FileLogger;
import logger.MailLogger;

public class Main {

	public static void main(String[] args) {
		Category category=new Category(1,"Programing");
		
		System.out.println(category.getCategoryName());
		
	}

}
